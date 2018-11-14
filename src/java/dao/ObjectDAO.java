/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Set;

import model.Nhanvien;

public interface ObjectDAO {
		public ArrayList<Nhanvien> getDanhSach();
		public Set<String> getDanhSachTheochuyenMon();
}