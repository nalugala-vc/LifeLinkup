package org.example.project.recipients.data

import org.example.project.database.LifelinkupDatabase
import org.example.project.recipients.domain.Recipient
import org.example.project.recipients.domain.RecipientDatasource

class SqlDelightRecipientDataSource(
    db: LifelinkupDatabase
): RecipientDatasource {

    private val queries = db.recipientQueries
    override suspend fun insertRecipient(recipient: Recipient) {
        queries.insertRecipient(
            id = recipient.id,
            fullName = recipient.name,
            email = recipient.email,
            password = recipient.password,
            dateOfBirth = recipient.dateOfBirth,
            phoneNumber = recipient.phoneNumber,
            country = recipient.phoneNumber,
            medicalHistory = recipient.medicalHistory,
            medialCondition = recipient.medicalCondition,
            currentMedication = recipient.currentMedication,
            bloodType = recipient.bloodType,
            hlaClassI = recipient.hlaClassI,
            hlaClassII = recipient.hlaClassII,
            bodyOrganType = recipient.bodyOrganType
        )
    }

    override suspend fun getRecipientById(id: Long) {
        queries.getRecipientById(id)
    }

}