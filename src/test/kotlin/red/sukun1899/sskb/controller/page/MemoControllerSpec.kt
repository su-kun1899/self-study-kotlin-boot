package red.sukun1899.sskb.controller.page

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.setup.MockMvcBuilders

/**
 * @author su-kun1899
 */
class MemoControllerSpec : Spek({
    given("MemoController") {
        val mockMvc = MockMvcBuilders.standaloneSetup(MemoController()).build()

        on("get") {
            val resultActions = mockMvc.perform(get("/memo/"))

            it("should return ok status") {
                resultActions.andExpect(status().isOk)
            }

            it("should have items attribute") {
                resultActions.andExpect(model().attributeExists("items"))
            }

            it("should return memo view") {
                resultActions.andExpect(view().name("memo"));
            }
        }

        on("getParams with 'foo'") {
            val resultActions = mockMvc.perform(get("/memo/param/foo"))

            it("should return ok status") {
                resultActions.andExpect(status().isOk)
            }

            it("should have items attribute") {
                resultActions.andExpect(model().attributeExists("items"))
            }

            it("should return memo view") {
                resultActions.andExpect(view().name("memo"));
            }
        }

        on("post with memo model") {
            val resultActions = mockMvc.perform(post("/memo/").param("memo", "foo").param("author", "bar"))

            it("should return ok status") {
                resultActions.andExpect(status().isOk)
            }

            it("should have items attribute") {
                resultActions.andExpect(model().attributeExists("items"))
            }

            it("should return memo view") {
                resultActions.andExpect(view().name("memo"));
            }
        }
    }
})