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
public class Agenda {
    
    int Codigo;
    String Nome;
    String Apelido;
    String RgIe;
    String CpfCnpj;
    String Endereco;
    String Numero;
    String Bairro;
    int CodigoCidade;
    String Cep;
    String Telefone;
    String Celular;
    String DtNasc;
    String Email;
    String Obs;
    int Exclusao;
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    //======================================    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    //======================================
    
     public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }
    
    //======================================
    
    public String getRgIe() {
        return RgIe;
    }
    
    public void setRgIe(String RgIe) {
        this.RgIe = RgIe;
    }
    
    //======================================
    
    public String getCpfCnpj() {
        return CpfCnpj;
    }

    public void setCpfCnpj(String CpfCnpj) {
        this.CpfCnpj = CpfCnpj;
    }
    
    //======================================
        
    public String getEndereco() {
        return Endereco;
    }
    
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    //======================================
    
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    //======================================
    
    public String getBairro() {
        return Bairro;
    }
    
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }
    
    //======================================
    
    public int getCodigoCidade() {
        return CodigoCidade;
    }
    
    public void setCodigoCidade(int CodigoCidade) {
        this.CodigoCidade = CodigoCidade;
    }
    
    //======================================
    
    public String getCep() {
        return Cep;
    }
    
    public void setCep(String Cep) {
        this.Cep = Cep;
    }
    
    //======================================
    
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    //======================================
    
    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    //======================================
    
    public String getDtNasc() {
        return DtNasc;
    }

    public void setDtNasc(String DtNasc) {
        this.DtNasc = DtNasc;
    }
    
    //======================================
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    //======================================
    
    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }
    
    //======================================

    public int getExclusao() {
        return Exclusao;
    }
    
    public void setExclusao(int Exclusao) {
        this.Exclusao = Exclusao;
    }
    
    //======================================    
    
}
