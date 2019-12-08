/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

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

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class Agenda_BD {
 
    private Agenda Agn;
    private ConexaoPostgresql Conexao;
    
    public void Salvar(){
        

        Conexao = new ConexaoPostgresql();
        Conexao.Conectar();
        Conexao.setSQL("select * from t_agenda where codigo = " + Agn.getCodigo() + " and exclusao = 0");
        ResultSet RS = Conexao.Consultar();
        
        String myDate = null;
                
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        myDate = sdf.format(Agn.getDtNasc());   
        System.out.println(myDate);
//       
//        try {
//            if(RS.next()){
//                String SQL;
//
//                SQL = "update t_agenda set nome = '" + jtfNome.getText() + "', apelido = '" + jtfApelido.getText() + "', ";
//                SQL = SQL + "endereco = '" + jtfEndereco.getText() + "', numero = '" +jtfNumero.getText() ;
//                SQL = SQL + "', bairro = '" + jtfBairro.getText() + "', " + "codigocidade = " + jtfCidade.getText() ;
//                SQL = SQL + ", cep = '" + jtfCep.getText() + "', telefone = '" + jtfTelefone.getText();
//                SQL = SQL + "', celular = '" + jtfCelular.getText() + "', email = '" + jtfEmail.getText();
//                SQL = SQL + "', obs = '" + jtpObs.getText() + "' ";
//                SQL = SQL + "where codigo = '" + jtfCodigo.getText() + "' ";
//
//                System.out.println(SQL);
//
//                Conexao.setSQL(SQL);
//                Conexao.Executar();
//            } else {
//                String SQL;
//
//                SQL = "insert into t_agenda (codigo, nome, apelido, rgie, cpfcnpj, endereco, numero, bairro, codigocidade, cep, telefone, celular, ";
//                SQL = SQL + "dtnasc, email, obs, exclusao) ";
//                SQL = SQL + "values (" + jtfCodigo.getText() + ", '" + jtfNome.getText() + "', '" + jtfApelido.getText() + "', '" + jtfRgIe.getText() + "', '";
//                SQL = SQL + jtfCpfCnpj.getText() + "', '" +  jtfEndereco.getText() + "', '" + jtfNumero.getText() + "', '" + jtfBairro.getText();
//                SQL = SQL + "', " + jtfCidade.getText() + ", '" + jtfCep.getText() + "', '" + jtfTelefone.getText() + "', '";
//                SQL = SQL + jtfCelular.getText() + "', '" + myDate + "', '" + jtfEmail.getText() + "', '";
//                SQL = SQL + jtpObs.getText() + "', 0)";
//
//                System.out.println(SQL);
//
//                Conexao.setSQL(SQL);
//                Conexao.Executar();
//            }
//
//        } catch (Exception Erro) {
//            JOptionPane.showMessageDialog(null, "Erro na validação: " + Erro);
//        }
//
//        Conexao.Desconectar();
//
//        Limpar();
//
//        jtfCodigo.requestFocus();
        
    }
    
}
