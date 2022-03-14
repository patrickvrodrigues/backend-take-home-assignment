package com.patrickvrodrigues.backendtakehomeassignment.validation

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class EducationLevelCorrectValidator(): ConstraintValidator<EducationLevelCorrect, EducationLevelEnum> {
    override fun isValid(value: EducationLevelEnum?, context: ConstraintValidatorContext?): Boolean {
        var result = false
        for (v in EducationLevelEnum.values()){
            println(v)
            if (v == value)
                result = true
        }
        return result
    }

}
