// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            calculate_median(listOf())
        }
    }

    // Write four more tests here
    "List of [0] gives a median of 0" {
        calculate_median(listOf(0.0f)) shouldBe 0.0f;
    }

    "List of [0, 1] gives a median of 0.5" {
        calculate_median(listOf(0.0f, 1.0f)) shouldBe 0.5f;
    }

    "List of [0, 1, 2] gives a median of 1" {
        calculate_median(listOf(0.0f, 1.0f, 2.0f)) shouldBe 1.0f;
    }

    "List of [0, 1, 2, 3] gives a median of 1.5" {
        calculate_median(listOf(0.0f, 1.0f, 2.0f, 3.0f)) shouldBe 1.5f;
    }
})
