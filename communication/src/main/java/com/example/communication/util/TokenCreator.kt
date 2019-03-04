package com.example.communication.util

import com.nimbusds.jose.*
import java.util.*
import com.nimbusds.jose.crypto.MACSigner
import com.nimbusds.jose.Payload
import com.nimbusds.jose.JWSAlgorithm
import com.nimbusds.jose.JWSHeader
import com.nimbusds.jose.JWSObject







fun generateToken(clientId: String): String{


    val signer = MACSigner(SECRET_KEY)

    val jwsObject = JWSObject(
        JWSHeader(JWSAlgorithm.HS256, JOSEObjectType.JWT, null, null, null, null, null, null, null, null, null, null, null),
        Payload(emulateServerResponse(clientId))
    )
    jwsObject.sign(signer)


    return jwsObject.serialize()


}

fun emulateServerResponse(clientId: String): String{
    val c = Calendar.getInstance()
    c.add(Calendar.YEAR, 1)
    return "{\n" +
            "  \"client\": \"$clientId\",\n" +
            "  \"channel\": \"$CHANNEL_ID\",\n" +
            "  \"permissions\": {\n" +
            "    \".*\": {\n" +
            "      \"publish\": true,\n" +
            "      \"subscribe\": true\n" +
            "    },\n" +
            "    \"^main-room\$\": {\n" +
            "      \"publish\": false,\n" +
            "      \"subscribe\": false\n" +
            "    }\n" +
            "  },\n" +
            "  \"exp\": ${c.timeInMillis}\n" +
            "}"
}



