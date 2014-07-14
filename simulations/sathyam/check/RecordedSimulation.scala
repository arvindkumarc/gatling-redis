package sathyam.check

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
		.acceptHeader("image/png,image/*;q=0.8,*/*;q=0.5")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Windows NT 6.2; WOW64; rv:17.0) Gecko/17.0 Firefox/17.0")

	val headers_1 = Map(
		"""Accept""" -> """text/javascript, text/html, application/xml, text/xml, */*""",
		"""Cache-Control""" -> """no-cache""",
		"""Content-Type""" -> """application/x-www-form-urlencoded; charset=UTF-8""",
		"""Pragma""" -> """no-cache""",
		"""X-Prototype-Version""" -> """1.7.1""",
		"""X-Requested-With""" -> """XMLHttpRequest""")

	val headers_3 = Map("""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""")

	val headers_5 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:36 GMT""")

	val headers_6 = Map(
		"""If-Modified-Since""" -> """Mon, 23 Dec 2013 12:00:00 GMT""",
		"""If-None-Match""" -> """"52b825c0-5a7a"""")

	val headers_7 = Map(
		"""If-Modified-Since""" -> """Mon, 24 Feb 2014 10:47:45 GMT""",
		"""If-None-Match""" -> """"530b2351-109dd"""")

	val headers_8 = Map(
		"""If-Modified-Since""" -> """Mon, 17 Feb 2014 06:25:05 GMT""",
		"""If-None-Match""" -> """"5301ab41-c8d3"""")

	val headers_9 = Map(
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:17 GMT""",
		"""If-None-Match""" -> """"53071ac9-1aa4c"""")

	val headers_10 = Map(
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:11 GMT""",
		"""If-None-Match""" -> """"53071aff-1b18"""")

	val headers_11 = Map(
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:11 GMT""",
		"""If-None-Match""" -> """"53071aff-1700"""")

	val headers_12 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:25 GMT""",
		"""If-None-Match""" -> """"53071ad1-7678"""")

	val headers_13 = Map(
		"""Accept""" -> """*/*""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:49 GMT""")

	val headers_14 = Map(
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:09 GMT""",
		"""If-None-Match""" -> """"53071afd-248"""")

	val headers_15 = Map(
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:15 GMT""",
		"""If-None-Match""" -> """"53071ac7-177c"""")

	val headers_16 = Map(
		"""Accept""" -> """*/*""",
		"""If-Modified-Since""" -> """Fri, 24 Jan 2014 07:24:36 GMT""")

	val headers_17 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""Cache-Control""" -> """max-age=0""")

	val headers_18 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:21:38 GMT""")

	val headers_19 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:11 GMT""",
		"""If-None-Match""" -> """"53071aff-1700"""")

	val headers_20 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:13 GMT""",
		"""If-None-Match""" -> """"53071ac5-257a"""")

	val headers_21 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:14 GMT""",
		"""If-None-Match""" -> """"53071b02-1aa4c"""")

	val headers_22 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:22 GMT""",
		"""If-None-Match""" -> """"53071ace-57fc"""")

	val headers_23 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:22:24 GMT""",
		"""If-None-Match""" -> """"53071ad0-6d50"""")

	val headers_24 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:21:50 GMT""")

	val headers_25 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:18 GMT""",
		"""If-None-Match""" -> """"53071b06-81d8"""")

	val headers_26 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:08 GMT""",
		"""If-None-Match""" -> """"53071afc-329a"""")

	val headers_27 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Wed, 26 Feb 2014 06:49:42 GMT""",
		"""If-None-Match""" -> """"530d8e86-6d7c"""")

	val headers_28 = Map(
		"""Accept""" -> """*/*""",
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 24 Jan 2014 07:24:36 GMT""")

	val headers_30 = Map(
		"""Cache-Control""" -> """max-age=0""",
		"""If-Modified-Since""" -> """Fri, 21 Feb 2014 09:23:12 GMT""",
		"""If-None-Match""" -> """"53071b00-177c"""")

	val headers_34 = Map("""Accept""" -> """*/*""")

	val headers_35 = Map(
		"""Accept""" -> """application/json, text/javascript, */*; q=0.01""",
		"""Cache-Control""" -> """no-cache""",
		"""Content-Type""" -> """application/json; charset=UTF-8;""",
		"""Pragma""" -> """no-cache""",
		"""X-Requested-With""" -> """XMLHttpRequest""")

	val scn = scenario("Scenario Name")
		.exec(http("request_1")
			.post("""http://teamcity.abcam.com/ajax.html?getRunningBuilds=1""")
			.headers(headers_1))
		.pause(973 milliseconds)
		.exec(http("request_2")
			.post("""http://teamcity.abcam.com/ajax.html""")
			.headers(headers_1)
			.param("""getProblemsSummary""", """bt294,bt29,bt36,bt23"""))
		.pause(6)
		.exec(http("request_3")
			.get("""/""")
			.headers(headers_3))
		.pause(55 milliseconds)
		.exec(http("request_4")
			.post("""http://teamcity.abcam.com/serverStatistics.html""")
			.headers(headers_1))
		.pause(305 milliseconds)
		.exec(http("request_5")
			.get("""/resources/styles/normalize.css?build=v3.7.2""")
			.headers(headers_5))
		.pause(446 milliseconds)
		.exec(http("request_6")
			.get("""http://img1.spicinemas.in/resources/images/home/C_320x165.jpg""")
			.headers(headers_6))
		.pause(109 milliseconds)
		.exec(http("request_7")
			.get("""http://img1.spicinemas.in/resources/images/home/A_320x165.jpg""")
			.headers(headers_7))
		.pause(128 milliseconds)
		.exec(http("request_8")
			.get("""http://img1.spicinemas.in/resources/images/home/B_320x165.jpg""")
			.headers(headers_8))
		.pause(67 milliseconds)
		.exec(http("request_9")
			.get("""/resources/images/spi-background-single.jpg""")
			.headers(headers_9))
		.pause(177 milliseconds)
		.exec(http("request_10")
			.get("""/resources/images/logo.png""")
			.headers(headers_10))
		.exec(http("request_11")
			.get("""/resources/images/icons.png""")
			.headers(headers_11))
		.pause(191 milliseconds)
		.exec(http("request_12")
			.get("""/resources/fonts/quicksand-bold-webfont.woff""")
			.headers(headers_12))
		.pause(428 milliseconds)
		.exec(http("request_13")
			.get("""/resources/js/home.js?build=v3.7.2""")
			.headers(headers_13))
		.pause(918 milliseconds)
		.exec(http("request_14")
			.get("""/resources/images/custom_input.png""")
			.headers(headers_14))
		.exec(http("request_15")
			.get("""/resources/images/owl/AjaxLoader.gif""")
			.headers(headers_15))
		.pause(61 milliseconds)
		.exec(http("request_16")
			.get("""http://www.google-analytics.com/analytics.js""")
			.headers(headers_16))
		.pause(2)
		.exec(http("request_17")
			.get("""/""")
			.headers(headers_17))
		.pause(257 milliseconds)
		.exec(http("request_18")
			.get("""/resources/styles/app.css?build=v3.7.2""")
			.headers(headers_18))
		.pause(448 milliseconds)
		.exec(http("request_19")
			.get("""/resources/images/icons.png""")
			.headers(headers_19))
		.pause(22 milliseconds)
		.exec(http("request_20")
			.get("""/resources/images//footer-sathyam.png""")
			.headers(headers_20))
		.pause(47 milliseconds)
		.exec(http("request_21")
			.get("""/resources/images/spi-background-single.jpg""")
			.headers(headers_21))
		.pause(20 milliseconds)
		.exec(http("request_22")
			.get("""/resources/fonts/helveticaneue-webfont.woff""")
			.headers(headers_22))
		.pause(34 milliseconds)
		.exec(http("request_23")
			.get("""/resources/fonts/HelveticaNeueLTPro-Lt.woff""")
			.headers(headers_23))
		.pause(89 milliseconds)
		.exec(http("request_24")
			.get("""/resources/js/home.js?build=v3.7.2""")
			.headers(headers_24))
		.pause(13 milliseconds)
		.exec(http("request_25")
			.get("""/resources/fonts/helr45w.woff""")
			.headers(headers_25))
		.pause(1)
		.exec(http("request_26")
			.get("""/resources/images/cinemas_experience.png""")
			.headers(headers_26))
		.pause(31 milliseconds)
		.exec(http("request_27")
			.get("""http://img1.spicinemas.in/resources/images/home/image-1.jpg""")
			.headers(headers_27))
		.pause(54 milliseconds)
		.exec(http("request_28")
			.get("""http://www.google-analytics.com/analytics.js""")
			.headers(headers_28))
		.pause(241 milliseconds)
		.exec(http("request_29")
			.get("""http://www.google-analytics.com/collect?v=1&_v=j16&a=737384220&t=pageview&_s=1&dl=http://www.spicinemas.in/&ul=en-us&de=ISO-8859-1&dt=SPI Cinemas - Movie show times, buy tickets online&sd=24-bit&sr=1024x768&vp=1007x664&je=0&fl=11.9 r900&_u=MAC~&cid=856146210.1393495033&tid=UA-35510687-2&z=1243056055"""))
		.pause(1)
		.exec(http("request_30")
			.get("""/resources/images/owl/AjaxLoader.gif""")
			.headers(headers_30))
		.pause(2)
		.exec(http("request_31")
			.get("""/chennai/show-times""")
			.headers(headers_3))
		.pause(1)
		.exec(http("request_32")
			.get("""/resources/images/ratings.png"""))
		.pause(13 milliseconds)
		.exec(http("request_33")
			.get("""/resources/images/experience_16_16.png"""))
		.pause(673 milliseconds)
		.exec(http("request_34")
			.get("""/resources/js/show.time.js?build=v3.7.2""")
			.headers(headers_34))
		.pause(1)
		.exec(http("request_35")
			.post("""/chennai/sessions/session-availability""")
			.headers(headers_35)
			.body(RawFileBody("RecordedSimulation_request_35.txt")))
		.pause(350 milliseconds)
		.exec(http("request_36")
			.get("""http://www.google-analytics.com/collect?v=1&_v=j16&a=322830655&t=pageview&_s=1&dl=http://www.spicinemas.in/chennai/show-times&ul=en-us&de=ISO-8859-1&dt=SPI Cinemas | Theatres | Show Times | Movie Schedule | Book Tickets Online&sd=24-bit&sr=1024x768&vp=1007x664&je=0&fl=11.9 r900&_u=MAC~&cid=856146210.1393495033&tid=UA-35510687-2&z=886030484"""))
		.pause(3)
		.exec(http("request_37")
			.post("""http://teamcity.abcam.com/eventTracker.html""")
			.headers(headers_1)
			.param("""subscriptionId""", """l;p:project38,m;p:project38,n;p:project38,p;p:project38,q;p:project38,a;p:project38,b;p:project38,c;p:project38,e;p:project38,v;p:project38,t;p:project38,u;p:project38,r;p:project38,s;p:project38,x;p:project38,H;,"""))
		.pause(4)
		.exec(http("request_38")
			.post("""http://teamcity.abcam.com/ajax.html?getRunningBuilds=1""")
			.headers(headers_1))
		.pause(942 milliseconds)
		.exec(http("request_39")
			.post("""http://teamcity.abcam.com/ajax.html""")
			.headers(headers_1)
			.param("""getProblemsSummary""", """bt294,bt29,bt36,bt23"""))

	setUp(scn.inject(atOnce(1 user))).protocols(httpProtocol)
}