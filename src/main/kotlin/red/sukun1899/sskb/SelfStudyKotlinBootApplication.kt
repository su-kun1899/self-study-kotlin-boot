package red.sukun1899.sskb

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SelfStudyKotlinBootApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SelfStudyKotlinBootApplication::class.java, *args)
        }
    }
}
