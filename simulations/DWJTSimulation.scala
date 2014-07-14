
import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import io.gatling.http.Headers.Values._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class DWJTSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:8080")
		.disableFollowRedirect
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
		.acceptEncodingHeader("gzip,deflate,sdch")
		.acceptLanguageHeader("en-US,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36")

	val headers_1 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""Content-Type""" -> """application/json""",
		"""Origin""" -> """http://localhost:8080""")

	val seatsIds = csv("seat_id").random
	val sessionIds = csv("session_id").random

	// val availabilityScn = scenario("avail")
	// 	.feed(sessionIds)
	// 	.exec(http("availability")
	// 		.get("""/Session/${sessionId}/Availability""")
	// 		.headers(headers_1)
	// 		.check(status.is(200))
	// 		.check(regex("dirty").exists))
	val blockScn = scenario("test")
		.feed(seatsIds)
		.exec(http("block")
			.post("""/seat/block""")
			.headers(headers_1)
			.body(StringBody("""{"seatNumbers" : ["${seatId}", "${anotherSeatId}", "${seatId}"]}"""))
			.check(status.is(200)))

	setUp(
		blockScn.inject(atOnce(10 users),
                 ramp(10 users) over (2 seconds),
                 constantRate(500 usersPerSec) during (10 seconds),
                 rampRate(500 usersPerSec) to(200 usersPerSec) during(5 minutes),
                 split(10000 users).into(ramp(500 users) over (10 seconds))
                                  .separatedBy(2 seconds)
                  )
                 // split(1000 users).into(ramp(10 users) over (10 seconds))
                 //                  .separatedBy(atOnce(30 users))
                 //)
		).protocols(httpProtocol)


	// setUp(
	// 	blockScn.inject(ramp(4900 users) over(10 seconds))
	// 	).protocols(httpProtocol)
}