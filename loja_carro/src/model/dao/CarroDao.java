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
	
	private String sql;
	private Connection con;

	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	CarroBean carroBean = new CarroBean();
	
	public boolean cadastrarCarro(CarroBean carroBean) {
		
		con = FabricaDeConexao.getConnection();

		sql = "INSERT INTO carro (marca, modelo, desc_mod, n_portas, ano, tipo, valor) VALUES (?,?,?,?,?,?,?)";

		try {

			stmt = con.prepareStatement(sql);
			stmt.setString(1, carroBean.getMarca());
			stmt.setString(2, carroBean.getModelo());
			stmt.setString(3, carroBean.getDescModelo());
			stmt.setInt(4, carroBean.getnPortas() );
			stmt.setString(5, carroBean.getAno() );
			stmt.setString(6, carroBean.getTipo() );
			stmt.setDouble(7, carroBean.getValor() );
			
			stmt.executeUpdate();

			return true;
			} catch (SQLException e) {
			System.err.println("Error during Register " + e);
				return false;
			} finally {
				FabricaDeConexao.closeConnection(con, stmt);
			}
		}
	
		public CarroBean detalharCarro(int getIdForm) {
		
		con = FabricaDeConexao.getConnection();

		String sql = "SELECT * FROM carro WHERE ID = ?;";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,getIdForm);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				carroBean = new CarroBean();
				carroBean.setId(rs.getInt("id"));	
				carroBean.setMarca(rs.getString("marca"));			
				carroBean.setModelo(rs.getString("modelo"));
				carroBean.setDescModelo(rs.getString("desc_mod"));			
				carroBean.setTipo(rs.getString("tipo"));
				carroBean.setnPortas(rs.getInt("n_portas"));			
				carroBean.setAno(rs.getString("ano"));
				carroBean.setValor (rs.getDouble("valor"));						
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
		
		con = FabricaDeConexao.getConnection();

		sql = "UPDATE carro SET marca =?, modelo=?, desc_mod=?, n_portas=?, ano=?, tipo=?, valor=? WHERE id ==?";

		try {

			stmt = con.prepareStatement(sql);
			stmt.setString(1, carroBean.getMarca());
			stmt.setString(2, carroBean.getModelo());
			stmt.setString(3, carroBean.getDescModelo());
			stmt.setInt(4, carroBean.getnPortas());
			stmt.setString(5, carroBean.getAno());
			stmt.setString(6, carroBean.getTipo());
			stmt.setDouble(7, carroBean.getValor());
			stmt.setInt(8, carroBean.getId());
			
			stmt.executeUpdate();

			return true;
			} catch (SQLException e) {
			System.err.println("Error during Register " + e);
				return false;
			} finally {
				FabricaDeConexao.closeConnection(con, stmt);
			}
		}
	
	
	public String removerCarro (int getIdForm) {
		
		con = FabricaDeConexao.getConnection();
		sql ="DELETE FROM carro WHERE id = ?";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,getIdForm);
			stmt.executeUpdate();		
			
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			FabricaDeConexao.closeConnection(con, stmt);
		}
		return "success";
	}

	public List<CarroBean> listarCarros() {
		
		List<CarroBean> listaDeCarros = new ArrayList<CarroBean>();
		
		con = FabricaDeConexao.getConnection();

		String sql = "SELECT id, marca, modelo, valor FROM carro;";

		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				
				CarroBean carroBean = new CarroBean();

				carroBean.setId(rs.getInt("id"));
				carroBean.setMarca(rs.getString("marca"));			
				carroBean.setModelo(rs.getString("modelo"));
				carroBean.setValor (rs.getDouble("valor"));			

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