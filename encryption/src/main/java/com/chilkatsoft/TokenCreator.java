package com.chilkatsoft;

import android.util.Log;

public class TokenCreator {
    static {
        // IMPORTANT: If one of the Chilkat subset shared libs is used, the name
        // passed to loadLibrary must match the share lib name.  For example, if the
        // shared lib is libchilkatcrypt.so, then pass "chilkatcrypt" to System.loadLibrary.

        System.loadLibrary("chilkat");
    }

    public static String generateToken(String clientId){
        CkPrivateKey privKey = new CkPrivateKey();

        //  Load an RSA private key from a PEM file.



        CkJwt jwt = new CkJwt();

        //  Build the JOSE header
        CkJsonObject jose = new CkJsonObject();
        //  Use RS256.  Pass the string "RS384" or "RS512" to use RSA with SHA-384 or SHA-512.
        jose.AppendString("alg","RS256");
        jose.AppendString("typ","JWT");

        //  Now build the JWT claims (also known as the payload)
        CkJsonObject claims = new CkJsonObject();
        claims.AppendString("iss","http://example.org");
        claims.AppendString("sub","John");
        claims.AppendString("aud","http://example.com");

        //  Set the timestamp of when the JWT was created to now.
        int curDateTime = jwt.GenNumericDate(0);
        claims.AddIntAt(-1,"iat",curDateTime);

        //  Set the "not process before" timestamp to now.
        claims.AddIntAt(-1,"nbf",curDateTime);

        //  Set the timestamp defining an expiration time (end time) for the token
        //  to be now + 1 hour (3600 seconds)
        claims.AddIntAt(-1,"exp",curDateTime + 3600);

        //  Produce the smallest possible JWT:
        jwt.put_AutoCompact(true);

        //  Create the JWT token.  This is where the RSA signature is created.
        String token = jwt.createJwtPk(jose.emit(),claims.emit(),privKey);
        return token;
    }
}
