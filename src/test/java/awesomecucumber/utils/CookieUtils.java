/*
package awesomecucumber.utils;

import io.restassured.http.Cookie;
import io.restassured.http.Cookies;

import java.util.ArrayList;
import java.util.List;

public class CookieUtils {

    public List<Cookie> covertRestAssuredCookiesToSeleniumCookies(Cookies cookies) {

        List<Cookie> restAssuredCookies;
        restAssuredCookies = cookies.asList();
        List<Cookie> seleniumCookies = new ArrayList<>();
        for(io.restassured.http.Cookie cookie : restAssuredCookies) {
            seleniumCookies.add(new Cookie(cookie.getName(), cookie.getValue(), cookie.getDomain(),
                    cookie.getPath(), cookie.getExpiryDate(), cookie.isSecured(),
            cookie.getSameSite()));
        }
        return seleniumCookies;
    }
}
*/
