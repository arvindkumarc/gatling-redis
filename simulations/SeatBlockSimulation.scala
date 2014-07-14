
import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import io.gatling.http.Headers.Values._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class SeatBlockSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://localhost:9000")
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip,deflate,sdch")
		.acceptLanguageHeader("en-US,en;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36")

	val headers_1 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8""",
		"""Cache-Control""" -> """max-age=0""",
		"""Content-Type""" -> """application/x-www-form-urlencoded""",
		"""Origin""" -> """http://localhost:9001""")

	val scn = scenario("Block seat")
		.exec(http("block")
			.post("""/Seat/Block""")
			.headers(headers_1)
			.param("""seatName""", """24000-A497""")
			.check(status.is(200))
			.check(regex("ok").exists))

	setUp(scn.inject(ramp(1 users) over(1 second))).protocols(httpProtocol)
}