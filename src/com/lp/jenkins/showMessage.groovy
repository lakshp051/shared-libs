package com.lp.jenkins

import static Constants.USER_HOME;

class showMessage {
    showMessage(){}
    def showMsg() {
        println(USER_HOME);
        return 1;
    }
}
