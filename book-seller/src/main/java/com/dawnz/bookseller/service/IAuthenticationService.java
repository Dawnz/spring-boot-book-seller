package com.dawnz.bookseller.service;

import com.dawnz.bookseller.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
