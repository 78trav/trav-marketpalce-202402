import kotlin.test.Test
import kotlin.test.assertEquals

class MyFirstTest {

    @Test
    fun test1() {
        // given
        val a = 1
        val b = 2

        val expected = 3

        // when
        val actual = a + b

        // then
        assertEquals(expected, actual)
    }

}
