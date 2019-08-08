package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.bean.CarroBean;
import util.conexao.FabricaDeConexao;

public class CarroDao {

	public void cadastrarCarro(CarroBean carroBean) {
		
		String sql;
		Connection con;
		PreparedStatement stmt = null;
		
		con = FabricaDeConexao.getConnection();

		sql = "INSERT INTO carro (marca, modelo, desc_mod, n_portas, ano, tipo, valor) VALUES (?,?,?,?,?,?,?)";

		try {
			int i = 1;
			stmt = con.prepareStatement(sql);
			stmt.setString(i++, carroBean.getMarca());
			stmt.setString(i++, carroBean.getModelo());
			stmt.setString(i++, carroBean.getDescModelo());
			stmt.setInt(i++, carroBean.getnPortas());
			stmt.setString(i++, carroBean.getAno());
			stmt.setString(i++, carroBean.getTipo());
			stmt.setString(i++, carroBean.getValor());

			stmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println("Error during Register " + e);
		} finally {
			FabricaDeConexao.closeConnection(con, stmt);
		}
	}

	public CarroBean detalharCarro(int getIdForm) {
		
		String sql;
		Connection con;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		CarroBean carroBean = new CarroBean();
		con = FabricaDeConexao.getConnection();

		sql = "SELECT * FROM carro WHERE ID = ?;";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, getIdForm);
			rs = stmt.executeQuery();

			if (rs.next()) {
				
				carroBean = new CarroBean();
				carroBean.setId(rs.getInt("id"));
				carroBean.setMarca(rs.getString("marca"));
				carroBean.setModelo(rs.getString("modelo"));
				carroBean.setDescModelo(rs.getString("desc_mod"));
				carroBean.setTipo(rs.getString("tipo"));
				carroBean.setnPortas(rs.getInt("n_portas"));
				carroBean.setAno(rs.getString("ano"));
				carroBean.setValor(rs.getString("valor"));
			}

			return carroBean;
		} catch (SQLException ex) {
			System.err.println("ERROR" + ex);
		} finally {
			con = FabricaDeConexao.getConnection();
		}
		return carroBean;

	}

	public boolean atualizarCarro(CarroBean carroBean) {
		String sql;
		Connection con;
		PreparedStatement stmt = null;
		
		con = FabricaDeConexao.getConnection();

		sql = "UPDATE carro SET marca =?, modelo=?, desc_mod=?, n_portas=?, ano=?, tipo=?, valor=? WHERE id=?";

		try {
			int i = 1; 
			stmt = con.prepareStatement(sql);
			stmt.setString(i++, carroBean.getMarca());
			stmt.setString(i++, carroBean.getModelo());
			stmt.setString(i++, carroBean.getDescModelo());
			stmt.setInt(i++, carroBean.getnPortas());
			stmt.setString(i++, carroBean.getAno());
			stmt.setString(i++, carroBean.getTipo());
			stmt.setString(i++, carroBean.getValor());
			stmt.setInt(i++, carroBean.getId());

			stmt.executeUpdate();

			return true;
		} catch (SQLException e) {
			System.err.println("Error during Register " + e);
			return false;
		} finally {
			FabricaDeConexao.closeConnection(con, stmt);
		}
	}

	public String removerCarro(int getIdForm) {
		String sql;
		Connection con;
		PreparedStatement stmt = null;	

		con = FabricaDeConexao.getConnection();
		sql = "DELETE FROM carro WHERE id = ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, getIdForm);
			stmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			FabricaDeConexao.closeConnection(con, stmt);
		}
		return "success";
	}

	public List<CarroBean> listarCarros() {
		
		String sql;
		Connection con;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CarroBean> listaDeCarros = new ArrayList<CarroBean>();

		con = FabricaDeConexao.getConnection();

		sql = "SELECT id, marca, modelo, valor FROM carro;";

		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CarroBean carroBean = new CarroBean();

				carroBean.setId(rs.getInt("id"));
				carroBean.setMarca(rs.getString("marca"));
				carroBean.setModelo(rs.getString("modelo"));
				carroBean.setValor(rs.getString("valor"));

				listaDeCarros.add(carroBean);
			}
		} catch (SQLException ex) {
			System.err.println("ERROR" + ex);
		} finally {
			con = FabricaDeConexao.getConnection();
		}
		return listaDeCarros;
	}

}
