package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

class ReferralCodeCalculator: OutputCalculatorI{
    override fun calculate(proModel: ProModel): Int {
        var referralCodePoint = 0

        if (proModel.referralCode.equals("token1234"))
            referralCodePoint += 1

        return referralCodePoint
    }
}