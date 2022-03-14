package com.patrickvrodrigues.backendtakehomeassignment.model.builder

import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel

class InternetTestModelBuilder {
    private var internetTestModel: InternetTestModel = InternetTestModel(
        null,
        50.4,
        40.2
        )

   fun withDownloadSpeed(downloadSpeed: Double): InternetTestModelBuilder{
       internetTestModel.downloadSpeed = downloadSpeed
       return this
   }

    fun withUploadSpeed(uploadSpeed: Double): InternetTestModelBuilder {
        internetTestModel.uploadSpeed = uploadSpeed
        return this
    }


    fun builder(): InternetTestModel {
        return this.internetTestModel
    }
}