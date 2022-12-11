/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Service.ValidateData;
import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ADMIN
 */
public class ValidateDataImpl implements ValidateData {

    @Override
    public boolean CheckEmail(String email) {
        if (email.length() >= 50) {
            return false;
        } else if (email.isEmpty()) {
            return false;
        } else if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean CheckPass(String pass) {
        if (pass.isEmpty()) {
            return false;
        } else if (pass.length() <= 6 || pass.length() >= 20) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean CheckUserName(String name) {
        if (name.isEmpty()) {
            return false;
        } else if (name.length() <= 6 || name.length() >= 20) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean CheckFullName(String name) {
        if (name.isEmpty()) {
            return false;
        } else if (name.length() >= 50) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkKyTuKhongDau(String text) { // check ký tự (Không bao gốm dấu)
        Pattern p = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        Matcher m = p.matcher(text);// Â
        return m.find();// Fasle
    }

    @Override
    public boolean checkKyTuCoDau(String text) { // check ký tự (Tviet có dấu)
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(text);// Â
        return m.find();// true
    }

    @Override
    public boolean checkso(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    @Override
    public boolean checksoThuc(String text) {
        Pattern pattern = Pattern.compile("[0-9]{1,13}(\\.[0-9]*)?");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    @Override
    public boolean checkNullText(String txt) {
        if (txt.trim().length() > 0) {//Trim() để xoá khoảng trắng ở dầu và cuối chuỗi
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
    }

    /**
     *
     * @param text
     * @return
     */
    public boolean chekcKhoangTrang(String text) {
        int temp = text.indexOf(" ");
        if (temp > -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkNullString(String text) {
        if (text.isBlank()) {
            return true;
        }
        return false;
    }
}
