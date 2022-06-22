package br.com.estoque.infra.repositories;

import io.agroal.api.AgroalDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.estoque.domain.usuarios.Usuario;
import br.com.estoque.domain.usuarios.interfaces.IUsuarioService;

public class UsuarioRepository implements IUsuarioService {

    private AgroalDataSource dataSource;

    public UsuarioRepository(AgroalDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        try {
            List<Usuario> listUsuarios = new ArrayList<Usuario>();

            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM SENAC.ES_DEPOSITOS");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();
                usuario.setUSUARIO(rs.getString("USUARIO"));
                usuario.setSENHA(rs.getString("SENHA"));

                listUsuarios.add(usuario);

            }

            rs.close();
            ps.close();
            connection.close();

            return listUsuarios;
        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public void createUsuario(Usuario usuario) {
        try {
            String query = "INSERT INTO SENAC.ES_USUARIOS (USUARIO, SENHA) VALUES('" + usuario.getUSUARIO() + "', '"
                    + usuario.getSENHA() + "')";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();

        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public void updateUsuario(Usuario usuario) {
        try {
            String query = "UPDATE ES_DEPOSITOS SET " +
                    "NOM_DEPOS='" + usuario.getUSUARIO() + "'" +
                    " WHERE ID = " + usuario.getSENHA();
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.executeQuery();

            ps.close();
            connection.close();

        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public String loginUser(String nome) {
        String senhaHashed = null;
        try {
            String query = "SELECT * FROM ES_USUARIOS WHERE USUARIO = '" + nome + "'";
            Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                senhaHashed = rs.getString("SENHA");
            }

            ps.close();
            connection.close();

            return senhaHashed;
        } catch (SQLException e) {
            throw new Error(e);
        }

    }

    @Override
    public void forgotUser(Usuario usuario) {
        // TODO Auto-generated method stub

    }
}
