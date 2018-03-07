import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ApplicationKtTest {

    @Test
    fun `add should return sum`() {
        assertThat(add(1, 2)).isEqualTo(3)
    }
}