package check.stress

import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import io.gatling.http.Headers.Values._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://www.spicinemas.in")
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.2; WOW64; rv:17.0) Gecko/17.0 Firefox/17.0")

	val headers_2 = Map(
		"""Accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""Cache-Control""" -> """no-cache""",
		"""Content-Type""" -> """application/json; charset=UTF-8;""",
		"""Pragma""" -> """no-cache""",
		"""X-Requested-With""" -> """XMLHttpRequest""")

	val headers_3 = Map("""Accept""" -> """image/png,image/*;q=0.8,*/*;q=0.5""")

	val headers_4 = Map(
		"""Accept""" -> """*/*""",
		"""If-None-Match""" -> """"527f3f2c-1000"""",
		"""X-Requested-With""" -> """XMLHttpRequest""")

	val scn = scenario("Scenario Name")
		.exec(http("request_1")
			.get("""/coimbatore/show-times"""))
		.pause(1)
		.exec(http("request_2")
			.post("""/coimbatore/sessions/session-availability""")
			.headers(headers_2)
			.body(RawFileBody("RecordedSimulation_request_2.txt")))
		.pause(130 milliseconds)
		.exec(http("request_3")
			.get("""http://www.google-analytics.com/collect?v=1&_v=j16&a=247239982&t=pageview&_s=1&dl=http://www.spicinemas.in/coimbatore/show-times&ul=en-us&de=ISO-8859-1&dt=SPI Cinemas | Theatres | Show Times | Movie Schedule | Book Tickets Online&sd=24-bit&sr=1024x768&vp=1007x664&je=0&fl=11.9 r900&_u=MAC~&cid=1089404617.1392014931&tid=UA-35510687-2&z=1927284988""")
			.headers(headers_3))
		.pause(2)
		.exec(http("request_4")
			.get("""/account/logged""")
			.headers(headers_4)
			.check(status.is(401)))

	setUp(scn.inject(atOnce(1 user))).protocols(httpProtocol)
}