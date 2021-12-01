package pl.lo1workshop.demo.api

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoApi {

    @GetMapping(
        value = ["/"],
        produces = [MediaType.TEXT_PLAIN_VALUE]
    )
    fun startPage(): String {
        return "Warsztaty w I Liceum Ogólnokształcącym"
    }
//
//    @GetMapping(
//        value = ["/welcome"],
//        produces = [MediaType.TEXT_PLAIN_VALUE]
//    )
//    fun welcomeAll(): String {
//        return "Witajcie wszyscy na spotkaniu !"
//    }
//
//    @GetMapping(
//        value = ["/welcome/{name}"],
//        produces = [MediaType.TEXT_PLAIN_VALUE]
//    )
//    fun welcomeOne(@PathVariable("name") name: String): String {
//        return "Witaj ${name.replaceFirstChar{ it.uppercase()}} !!"
//    }

}