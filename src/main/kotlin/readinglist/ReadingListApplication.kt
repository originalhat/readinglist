package readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
class ReadingListApplication

fun main(args: Array<String>) {
  SpringApplication.run(ReadingListApplication::class.java, *args)
}

//override fun addViewControllers(registry: ViewControllerRegistry) {
//  registry.addRedirectViewController("/", "/readingList")
//}
