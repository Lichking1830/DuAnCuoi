/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public interface ValidateData {

    boolean CheckEmail(String email);

    boolean CheckPass(String pass);

    boolean CheckUserName(String name);

    boolean CheckFullName(String name);

    boolean checkNullString(String text);

    boolean checkKyTuKhongDau(String text);

    boolean checkKyTuCoDau(String text);

    boolean checkso(String text);

    boolean checksoThuc(String text);

    boolean checkNullText(String txt);

    String unAccent(String s);

    boolean chekcKhoangTrang(String text);
}
