package com.coditory.sample

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : FunSpec({
    context("this outer block is enabled") {
        test("2 + 2 == 4") {
            Calculator.add(2, 2) shouldBe 4
        }
    }
})
