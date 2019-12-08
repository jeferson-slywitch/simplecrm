/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *    This file is part of Foobar.
 *
 *   Foobar is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   Foobar is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Este arquivo é parte do programa Foobar
 *
 *   Foobar é um software livre; você pode redistribuí-lo e/ou 
 *   modificá-lo dentro dos termos da Licença Pública Geral GNU como 
 *   publicada pela Fundação do Software Livre (FSF); na versão 3 da 
 *   Licença, ou (na sua opinião) qualquer versão.
 *
 *   Este programa é distribuído na esperança de que possa ser  útil, 
 *   mas SEM NENHUMA GARANTIA; sem uma garantia implícita de ADEQUAÇÃO
 *   a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 *   Licença Pública Geral GNU para maiores detalhes.
 *
 *   Você deve ter recebido uma cópia da Licença Pública Geral GNU junto
 *   com este programa, Se não, veja <http://www.gnu.org/licenses/>.
 *
 * 
 * @author Jeferson Slywitch - jeferson.slywitch@gmail.com
 */
public class ConexaoPostgresql {

    private String SQL, usuario, senha;
    private Connection Con;

    public Connection getCon() {
        return Con;
    }
    private Statement ST;
    private ResultSet RS;

    public ConexaoPostgresql(){
    }

    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean Conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            usuario = "user";
            senha = "********";
            //String db = "jdbc:postgresql://192.168.0.139:5432/T.I.Teste";
            String db = "jdbc:postgresql://192.168.0.139:5432/T.I.";
            Con = DriverManager.getConnection(db, usuario, senha);
            ST = Con.createStatement();
            return true;
        } catch (Exception Erro) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + Erro);
            return false;
        }
    }

    public ResultSet Consultar(){
        try {
            RS = ST.executeQuery(SQL);
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro durante a consulta: " + Erro);
        }
        return RS;
    }

    public void Executar(){
        try {
            ST.executeUpdate(SQL);
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro durante a execução: " + Erro);
        }
    }

    public void Desconectar(){
        try {
            Con.close();
        } catch (Exception Erro){
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: " + Erro);
        }
    }

    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    public String getSQL() {
        return SQL;
    }

}
