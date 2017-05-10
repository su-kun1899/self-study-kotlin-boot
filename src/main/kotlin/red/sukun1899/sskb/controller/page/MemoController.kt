package red.sukun1899.sskb.controller.page

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import red.sukun1899.sskb.model.Memo

/**
 * @author su-kun1899
 */
@Controller
@RequestMapping("memo")
class MemoController {
    @GetMapping
    fun get(model: Model): String {
        val item = mapOf<String, Any>(
                "memo" to "Empty Memo",
                "author" to "Empty Author"
        )
        val items = listOf<Map<String, Any>>(item)
        model.addAttribute("items", items)

        return "memo"
    }

    @PostMapping
    fun post(@ModelAttribute item: Memo, model: Model): String {
        val items = listOf<Memo>(item)
        model.addAttribute("items", items)

        return "memo"
    }
}