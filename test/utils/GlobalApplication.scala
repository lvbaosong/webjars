package utils

import org.specs2.specification.AfterAll
import play.api.inject.bind
import play.api.inject.guice.GuiceApplicationBuilder

trait GlobalApplication extends AfterAll {

  lazy val application = new GuiceApplicationBuilder().overrides(bind[BinTray].to[BinTrayMock]).build

  override def afterAll: Unit = {
    application.stop()
  }

}
