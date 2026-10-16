// Task 9.6: unit tests for calculate_variance()

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

const val tolerance = 0.000001

@Suppress("unused")
class VarianceTest : FreeSpec({
    "Exception if dataset is empty" {
        shouldThrow<IllegalArgumentException> {
            calculate_variance(listOf<Double>())
        }
    }

    "Exception if dataset contains just one value" {
        shouldThrow<IllegalArgumentException> {
            calculate_variance(listOf(0.0))
        }
    }

    "Variance is 0 if dataset values are all the same" {
        val data = listOf(1.0, 1.0, 1.0)
        calculate_variance(data) shouldBe (0.0 plusOrMinus tolerance)
    }

    "Variance of [1, 2, 3] is 1" {
        val data = listOf(1.0, 2.0, 3.0)
        calculate_variance(data) shouldBe (1.0 plusOrMinus tolerance)
    }

    "Variance of [1, 2, 3, 4] is 1.666666..." {
        val data = listOf(1.0, 2.0, 3.0, 4.0)
        calculate_variance(data) shouldBe (1.666666 plusOrMinus tolerance)
    }
})
