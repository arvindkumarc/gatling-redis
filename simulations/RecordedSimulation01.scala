
import io.gatling.core.Predef._
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.Headers.Names._
import io.gatling.http.Headers.Values._
import scala.concurrent.duration._
import bootstrap._
import assertions._

class RecordedSimulation01 extends Simulation {

	val httpProtocol = http
		.baseURL("https://webwewant.twhosted.com:443")
		.disableFollowRedirect
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.connection("keep-alive")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.9; rv:29.0) Gecko/20100101 Firefox/29.0")

	val headers_1 = Map(
		"""Accept""" -> """image/png,image/*;q=0.8,*/*;q=0.5""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_2 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""If-None-Match""" -> """"0a16310a53e6d0f0b29b64020da02752"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_3 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Fri, 06 Jun 2014 07:03:37 GMT""",
		"""If-None-Match""" -> """"2875a3ccf978de0978ef82213b315a65"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_4 = Map(
		"""If-Modified-Since""" -> """Mon, 26 May 2014 05:40:21 GMT""",
		"""If-None-Match""" -> """"6e3920d87a0f9be18aff05235d9c84f8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_5 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"f84529839e37c80a9dad6ccbe9bdfd74"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_6 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"c3cbc01acdb36a7b60acd84c1e9fe1a8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_7 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"a24e554a9a6d6c28653e70bfc76de0ed"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_8 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"698d28841cdbf2be78f693b647841fad"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_9 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"8fa4f635e697cdd00463a7d180b3d8fd"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_10 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 07:28:27 GMT""",
		"""If-None-Match""" -> """"7c802dac6939018d37130bf595d15720"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_11 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"e5beec3cff1d4f50a4cd3e899ca717de"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_12 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"2628aaaf85654566c56f4cb27f8dd593"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_13 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 05:03:33 GMT""",
		"""If-None-Match""" -> """"dadcafb054005773f4bcfa751925e456"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_14 = Map(
		"""If-Modified-Since""" -> """Wed, 28 May 2014 12:03:28 GMT""",
		"""If-None-Match""" -> """"6d8a1e799fb881de01af81841c2c0c83"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_15 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"a56c2bdbc69912687edee046a8df2b56"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_16 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"269a1a8bf66d0201c9953347e98a0d00"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_17 = Map(
		"""If-Modified-Since""" -> """Thu, 05 Jun 2014 06:51:57 GMT""",
		"""If-None-Match""" -> """"f24cffa1ff01d2882ff3c86658ba0b52"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_18 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"ebf08dba3e0688e6bc400edff06569f5"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_19 = Map(
		"""Accept""" -> """image/png,image/*;q=0.8,*/*;q=0.5""",
		"""If-Modified-Since""" -> """Tue, 10 Jun 2014 05:48:50 GMT""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_20 = Map(
		"""Accept""" -> """image/png,image/*;q=0.8,*/*;q=0.5""",
		"""If-Modified-Since""" -> """Tue, 10 Jun 2014 06:32:01 GMT""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_21 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""If-None-Match""" -> """"ff1f168526ffef0b632e0833eaa501e1"""",
		"""Referer""" -> """https://webwewant.twhosted.com/""")

	val headers_22 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"f84529839e37c80a9dad6ccbe9bdfd74"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_23 = Map(
		"""If-Modified-Since""" -> """Mon, 26 May 2014 05:40:21 GMT""",
		"""If-None-Match""" -> """"6e3920d87a0f9be18aff05235d9c84f8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_24 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"8fa4f635e697cdd00463a7d180b3d8fd"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_25 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 07:28:27 GMT""",
		"""If-None-Match""" -> """"7c802dac6939018d37130bf595d15720"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_26 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"0fa28ec1e038e92409fbac1b76ab8f1a"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_27 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"2628aaaf85654566c56f4cb27f8dd593"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_28 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"ebf08dba3e0688e6bc400edff06569f5"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_29 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Fri, 06 Jun 2014 07:03:37 GMT""",
		"""If-None-Match""" -> """"2875a3ccf978de0978ef82213b315a65"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_30 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"e5beec3cff1d4f50a4cd3e899ca717de"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_31 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 05:03:33 GMT""",
		"""If-None-Match""" -> """"dadcafb054005773f4bcfa751925e456"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_32 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"a56c2bdbc69912687edee046a8df2b56"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_33 = Map(
		"""If-Modified-Since""" -> """Wed, 28 May 2014 12:03:28 GMT""",
		"""If-None-Match""" -> """"6d8a1e799fb881de01af81841c2c0c83"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_34 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"a4c11360fb4e77479f833b136d2bd4b8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_35 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"698d28841cdbf2be78f693b647841fad"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_36 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"c3cbc01acdb36a7b60acd84c1e9fe1a8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_37 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""If-None-Match""" -> """"3836e977a6484de7792b0f231a5c611c"""",
		"""Referer""" -> """https://webwewant.twhosted.com/about_us""")

	val headers_38 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Fri, 06 Jun 2014 07:03:37 GMT""",
		"""If-None-Match""" -> """"2875a3ccf978de0978ef82213b315a65"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_39 = Map(
		"""If-Modified-Since""" -> """Mon, 26 May 2014 05:40:21 GMT""",
		"""If-None-Match""" -> """"6e3920d87a0f9be18aff05235d9c84f8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_40 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"c3cbc01acdb36a7b60acd84c1e9fe1a8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_41 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Fri, 06 Jun 2014 07:03:37 GMT""",
		"""If-None-Match""" -> """"e3c33c619e6a9581d6e15e3da0f0b80f"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_42 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"f84529839e37c80a9dad6ccbe9bdfd74"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_43 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"698d28841cdbf2be78f693b647841fad"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_44 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"8fa4f635e697cdd00463a7d180b3d8fd"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_45 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"ebf08dba3e0688e6bc400edff06569f5"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_46 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 07:28:27 GMT""",
		"""If-None-Match""" -> """"7c802dac6939018d37130bf595d15720"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_47 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 05:03:33 GMT""",
		"""If-None-Match""" -> """"dadcafb054005773f4bcfa751925e456"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_48 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"2628aaaf85654566c56f4cb27f8dd593"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_49 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"e5beec3cff1d4f50a4cd3e899ca717de"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_50 = Map(
		"""If-Modified-Since""" -> """Wed, 28 May 2014 12:03:28 GMT""",
		"""If-None-Match""" -> """"6d8a1e799fb881de01af81841c2c0c83"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_51 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"15b5c7e4872ae0925c71bc8ea03ea045"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_52 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 10:20:16 GMT""",
		"""If-None-Match""" -> """"f1b17f943af5460ad4a70056534e9d62"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_53 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"a56c2bdbc69912687edee046a8df2b56"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_55 = Map(
		"""Accept""" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
		"""If-None-Match""" -> """"c496c13ec635c32f5e408af20b207381"""",
		"""Referer""" -> """https://webwewant.twhosted.com/take_action""")

	val headers_56 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 07:28:27 GMT""",
		"""If-None-Match""" -> """"238a765ffc291b09d0694690593b9631"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_57 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"698d28841cdbf2be78f693b647841fad"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_58 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"856b50e4b21be1d1d3f694c8c939cc3c"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_59 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"f84529839e37c80a9dad6ccbe9bdfd74"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_60 = Map(
		"""If-Modified-Since""" -> """Mon, 26 May 2014 05:40:21 GMT""",
		"""If-None-Match""" -> """"6e3920d87a0f9be18aff05235d9c84f8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_61 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 07:28:27 GMT""",
		"""If-None-Match""" -> """"7c802dac6939018d37130bf595d15720"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_62 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"ebf08dba3e0688e6bc400edff06569f5"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_63 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"8fa4f635e697cdd00463a7d180b3d8fd"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_64 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"2628aaaf85654566c56f4cb27f8dd593"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_65 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"c3cbc01acdb36a7b60acd84c1e9fe1a8"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_66 = Map(
		"""If-Modified-Since""" -> """Wed, 21 May 2014 09:23:42 GMT""",
		"""If-None-Match""" -> """"e5beec3cff1d4f50a4cd3e899ca717de"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_67 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 11:49:00 GMT""",
		"""If-None-Match""" -> """"a56c2bdbc69912687edee046a8df2b56"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_68 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 05:03:33 GMT""",
		"""If-None-Match""" -> """"dadcafb054005773f4bcfa751925e456"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_69 = Map(
		"""If-Modified-Since""" -> """Wed, 04 Jun 2014 07:28:27 GMT""",
		"""If-None-Match""" -> """"0f9f98fac7dff7f863bf52c707aac8fe"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_70 = Map(
		"""If-Modified-Since""" -> """Wed, 28 May 2014 12:03:28 GMT""",
		"""If-None-Match""" -> """"6d8a1e799fb881de01af81841c2c0c83"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_71 = Map(
		"""If-Modified-Since""" -> """Thu, 05 Jun 2014 06:51:57 GMT""",
		"""If-None-Match""" -> """"f24cffa1ff01d2882ff3c86658ba0b52"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_72 = Map(
		"""If-Modified-Since""" -> """Mon, 09 Jun 2014 07:06:52 GMT""",
		"""If-None-Match""" -> """"5045ca62e26710bf72e58f274957da32"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_73 = Map(
		"""Accept""" -> """text/css,*/*;q=0.1""",
		"""If-Modified-Since""" -> """Fri, 06 Jun 2014 07:03:37 GMT""",
		"""If-None-Match""" -> """"2875a3ccf978de0978ef82213b315a65"""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val headers_76 = Map(
		"""Accept""" -> """image/png,image/*;q=0.8,*/*;q=0.5""",
		"""If-Modified-Since""" -> """Tue, 10 Jun 2014 05:48:50 GMT""",
		"""Referer""" -> """https://webwewant.twhosted.com/activity_hub""")

	val chain_0 = exec(http("request_1")
			.get("""/ckeditor_assets/pictures/2/content_partner-logo.png""")
			.headers(headers_1))
		.pause(6)
		.exec(http("request_2")
			.get("""/""")
			.headers(headers_2)
			.check(status.is(304)))
		.pause(264 milliseconds)
		.exec(http("request_3")
			.get("""/assets/font-awesome.css?body=1""")
			.headers(headers_3)
			.check(status.is(304)))
		.pause(31 milliseconds)
		.exec(http("request_4")
			.get("""/assets/jquery.min.js?body=1""")
			.headers(headers_4)
			.check(status.is(304)))
		.exec(http("request_5")
			.get("""/assets/application.css?body=1""")
			.headers(headers_5)
			.check(status.is(304)))
		.exec(http("request_6")
			.get("""/assets/ckeditor/init.js?body=1""")
			.headers(headers_6)
			.check(status.is(304)))
		.pause(13 milliseconds)
		.exec(http("request_7")
			.get("""/assets/home.css?body=1""")
			.headers(headers_7)
			.check(status.is(304)))
		.exec(http("request_8")
			.get("""/assets/ckeditor/override.js?body=1""")
			.headers(headers_8)
			.check(status.is(304)))
		.pause(191 milliseconds)
		.exec(http("request_9")
			.get("""/assets/ckeditor/ckeditor.js?body=1""")
			.headers(headers_9)
			.check(status.is(304)))
		.pause(55 milliseconds)
		.exec(http("request_10")
			.get("""/assets/underscore.min.js?body=1""")
			.headers(headers_10)
			.check(status.is(304)))
		.pause(22 milliseconds)
		.exec(http("request_11")
			.get("""/assets/ckeditor/adapters/jquery.js?body=1""")
			.headers(headers_11)
			.check(status.is(304)))
		.exec(http("request_12")
			.get("""/assets/jquery.color.js?body=1""")
			.headers(headers_12)
			.check(status.is(304)))
		.exec(http("request_13")
			.get("""/assets/social_media.js?body=1""")
			.headers(headers_13)
			.check(status.is(304)))
		.pause(232 milliseconds)
		.exec(http("request_14")
			.get("""/assets/jquery-ui.min.js?body=1""")
			.headers(headers_14)
			.check(status.is(304)))
		.exec(http("request_15")
			.get("""/assets/application.js?body=1""")
			.headers(headers_15)
			.check(status.is(304)))
		.pause(15 milliseconds)
		.exec(http("request_16")
			.get("""/assets/home.js?body=1""")
			.headers(headers_16)
			.check(status.is(304)))
		.exec(http("request_17")
			.get("""/assets/item_colored_and_clickable.js?body=1""")
			.headers(headers_17)
			.check(status.is(304)))
		.pause(238 milliseconds)
		.exec(http("request_18")
			.get("""/assets/style.js?body=1""")
			.headers(headers_18)
			.check(status.is(304)))
		.pause(354 milliseconds)
		.exec(http("request_19")
			.get("""/system/image_artifacts/pictures/4/project/images-dummy.jpeg?1402379330=""")
			.headers(headers_19)
			.check(status.is(304)))
		.pause(19 milliseconds)
		.exec(http("request_20")
			.get("""/ckeditor_assets/pictures/1/content_img-20140420-wa0008.jpg""")
			.headers(headers_20)
			.check(status.is(304)))
		.pause(2)
		.exec(http("request_21")
			.get("""/about_us""")
			.headers(headers_21)
			.check(status.is(304)))
		.pause(247 milliseconds)
		.exec(http("request_22")
			.get("""/assets/application.css?body=1""")
			.headers(headers_22)
			.check(status.is(304)))
		.pause(34 milliseconds)
		.exec(http("request_23")
			.get("""/assets/jquery.min.js?body=1""")
			.headers(headers_23)
			.check(status.is(304)))
		.pause(191 milliseconds)
		.exec(http("request_24")
			.get("""/assets/ckeditor/ckeditor.js?body=1""")
			.headers(headers_24)
			.check(status.is(304)))
		.pause(28 milliseconds)
		.exec(http("request_25")
			.get("""/assets/underscore.min.js?body=1""")
			.headers(headers_25)
			.check(status.is(304)))
		.pause(22 milliseconds)
		.exec(http("request_26")
			.get("""/assets/aboutus.css?body=1""")
			.headers(headers_26)
			.check(status.is(304)))
		.pause(195 milliseconds)
		.exec(http("request_27")
			.get("""/assets/jquery.color.js?body=1""")
			.headers(headers_27)
			.check(status.is(304)))
		.exec(http("request_28")
			.get("""/assets/style.js?body=1""")
			.headers(headers_28)
			.check(status.is(304)))
		.pause(77 milliseconds)
		.exec(http("request_29")
			.get("""/assets/font-awesome.css?body=1""")
			.headers(headers_29)
			.check(status.is(304)))
		.exec(http("request_30")
			.get("""/assets/ckeditor/adapters/jquery.js?body=1""")
			.headers(headers_30)
			.check(status.is(304)))
		.pause(147 milliseconds)
		.exec(http("request_31")
			.get("""/assets/social_media.js?body=1""")
			.headers(headers_31)
			.check(status.is(304)))
		.pause(38 milliseconds)
		.exec(http("request_32")
			.get("""/assets/application.js?body=1""")
			.headers(headers_32)
			.check(status.is(304)))
		.pause(70 milliseconds)
		.exec(http("request_33")
			.get("""/assets/jquery-ui.min.js?body=1""")
			.headers(headers_33)
			.check(status.is(304)))
		.exec(http("request_34")
			.get("""/assets/aboutus.js?body=1""")
			.headers(headers_34)
			.check(status.is(304)))
		.pause(319 milliseconds)
		.exec(http("request_35")
			.get("""/assets/ckeditor/override.js?body=1""")
			.headers(headers_35)
			.check(status.is(304)))
		.pause(281 milliseconds)
		.exec(http("request_36")
			.get("""/assets/ckeditor/init.js?body=1""")
			.headers(headers_36)
			.check(status.is(304)))
		.pause(4)
		.exec(http("request_37")
			.get("""/take_action""")
			.headers(headers_37)
			.check(status.is(304)))
		.pause(257 milliseconds)
		.exec(http("request_38")
			.get("""/assets/font-awesome.css?body=1""")
			.headers(headers_38)
			.check(status.is(304)))
		.pause(13 milliseconds)
		.exec(http("request_39")
			.get("""/assets/jquery.min.js?body=1""")
			.headers(headers_39)
			.check(status.is(304)))
		.pause(30 milliseconds)
		.exec(http("request_40")
			.get("""/assets/ckeditor/init.js?body=1""")
			.headers(headers_40)
			.check(status.is(304)))
		.exec(http("request_41")
			.get("""/assets/take_action.css?body=1""")
			.headers(headers_41)
			.check(status.is(304)))
		.exec(http("request_42")
			.get("""/assets/application.css?body=1""")
			.headers(headers_42)
			.check(status.is(304)))
		.exec(http("request_43")
			.get("""/assets/ckeditor/override.js?body=1""")
			.headers(headers_43)
			.check(status.is(304)))
		.pause(195 milliseconds)
		.exec(http("request_44")
			.get("""/assets/ckeditor/ckeditor.js?body=1""")
			.headers(headers_44)
			.check(status.is(304)))
		.pause(40 milliseconds)
		.exec(http("request_45")
			.get("""/assets/style.js?body=1""")
			.headers(headers_45)
			.check(status.is(304)))
		.exec(http("request_46")
			.get("""/assets/underscore.min.js?body=1""")
			.headers(headers_46)
			.check(status.is(304)))
		.pause(32 milliseconds)
		.exec(http("request_47")
			.get("""/assets/social_media.js?body=1""")
			.headers(headers_47)
			.check(status.is(304)))
		.pause(26 milliseconds)
		.exec(http("request_48")
			.get("""/assets/jquery.color.js?body=1""")
			.headers(headers_48)
			.check(status.is(304)))
		.exec(http("request_49")
			.get("""/assets/ckeditor/adapters/jquery.js?body=1""")
			.headers(headers_49)
			.check(status.is(304)))
		.pause(189 milliseconds)
		.exec(http("request_50")
			.get("""/assets/jquery-ui.min.js?body=1""")
			.headers(headers_50)
			.check(status.is(304)))
		.pause(37 milliseconds)
		.exec(http("request_51")
			.get("""/assets/takeaction.js?body=1""")
			.headers(headers_51)
			.check(status.is(304)))
		.exec(http("request_52")
			.get("""/assets/take_action_header.js?body=1""")
			.headers(headers_52)
			.check(status.is(304)))
		.exec(http("request_53")
			.get("""/assets/application.js?body=1""")
			.headers(headers_53)
			.check(status.is(304)))
		.pause(274 milliseconds)
		.exec(http("request_54")
			.get("""/assets/style.js?body=1""")
			.headers(headers_45)
			.check(status.is(304)))
		.pause(3)
		.exec(http("request_55")
			.get("""/activity_hub""")
			.headers(headers_55)
			.check(status.is(304)))
		.pause(339 milliseconds)
		.exec(http("request_56")
			.get("""/assets/chosen.min.css?body=1""")
			.headers(headers_56)
			.check(status.is(304)))
		.exec(http("request_57")
			.get("""/assets/ckeditor/override.js?body=1""")
			.headers(headers_57)
			.check(status.is(304)))
		.pause(13 milliseconds)
		.exec(http("request_58")
			.get("""/assets/activity.css?body=1""")
			.headers(headers_58)
			.check(status.is(304)))
		.exec(http("request_59")
			.get("""/assets/application.css?body=1""")
			.headers(headers_59)
			.check(status.is(304)))
		.exec(http("request_60")
			.get("""/assets/jquery.min.js?body=1""")
			.headers(headers_60)
			.check(status.is(304)))
		.pause(253 milliseconds)

val chain_1 = exec(http("request_61")
			.get("""/assets/underscore.min.js?body=1""")
			.headers(headers_61)
			.check(status.is(304)))
		.exec(http("request_62")
			.get("""/assets/style.js?body=1""")
			.headers(headers_62)
			.check(status.is(304)))
		.exec(http("request_63")
			.get("""/assets/ckeditor/ckeditor.js?body=1""")
			.headers(headers_63)
			.check(status.is(304)))
		.pause(15 milliseconds)
		.exec(http("request_64")
			.get("""/assets/jquery.color.js?body=1""")
			.headers(headers_64)
			.check(status.is(304)))
		.exec(http("request_65")
			.get("""/assets/ckeditor/init.js?body=1""")
			.headers(headers_65)
			.check(status.is(304)))
		.pause(259 milliseconds)
		.exec(http("request_66")
			.get("""/assets/ckeditor/adapters/jquery.js?body=1""")
			.headers(headers_66)
			.check(status.is(304)))
		.exec(http("request_67")
			.get("""/assets/application.js?body=1""")
			.headers(headers_67)
			.check(status.is(304)))
		.exec(http("request_68")
			.get("""/assets/social_media.js?body=1""")
			.headers(headers_68)
			.check(status.is(304)))
		.exec(http("request_69")
			.get("""/assets/chosen.jquery.min.js?body=1""")
			.headers(headers_69)
			.check(status.is(304)))
		.pause(13 milliseconds)
		.exec(http("request_70")
			.get("""/assets/jquery-ui.min.js?body=1""")
			.headers(headers_70)
			.check(status.is(304)))
		.pause(216 milliseconds)
		.exec(http("request_71")
			.get("""/assets/item_colored_and_clickable.js?body=1""")
			.headers(headers_71)
			.check(status.is(304)))
		.exec(http("request_72")
			.get("""/assets/activity_hub.js?body=1""")
			.headers(headers_72)
			.check(status.is(304)))
		.pause(1)
		.exec(http("request_73")
			.get("""/assets/font-awesome.css?body=1""")
			.headers(headers_73)
			.check(status.is(304)))
		.pause(321 milliseconds)
		.exec(http("request_74")
			.get("""/assets/style.js?body=1""")
			.headers(headers_62)
			.check(status.is(304)))
		.pause(240 milliseconds)
		.exec(http("request_75")
			.get("""/assets/item_colored_and_clickable.js?body=1""")
			.headers(headers_71)
			.check(status.is(304)))
		.pause(271 milliseconds)
		.exec(http("request_76")
			.get("""/system/image_artifacts/pictures/4/project/images-dummy.jpeg?1402379330=""")
			.headers(headers_76)
			.check(status.is(304)))
					
	val scn = scenario("Scenario Name").exec(
		chain_0, chain_1)

	setUp(scn.inject(ramp(100 users) over (60 seconds))).protocols(httpProtocol)
}