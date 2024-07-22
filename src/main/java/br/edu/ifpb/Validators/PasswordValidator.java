package Validators;

import Interfaces.UserInterface;
import exceptions.*;

public class PasswordValidator {
        public boolean passwordValidade(UserInterface user, String password) throws WrongPasswordException {
            if (user.getSenha().equals(password)) {
                return true;
            } else {
                throw new WrongPasswordException();
            }
        }
    }
