package org.example.project.recipients.domain

interface RecipientDatasource {
    suspend fun insertRecipient(recipient: Recipient)
    suspend fun getRecipientById(id : Long)
}