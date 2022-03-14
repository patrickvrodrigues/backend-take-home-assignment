package com.patrickvrodrigues.backendtakehomeassignment.model.builder

import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel

class PastExperiencesModelBuilder {
    private var pastExperiencesModel: PastExperiencesModel = PastExperiencesModel(
        null,
        false,
        true
    )

    fun withSales(sales: Boolean): PastExperiencesModelBuilder{
        pastExperiencesModel.sales = sales
        return this
    }

    fun withSupport(support: Boolean): PastExperiencesModelBuilder{
        pastExperiencesModel.support = support
        return this
    }

    fun builder(): PastExperiencesModel {
        return this.pastExperiencesModel
    }
}