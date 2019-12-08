/*
 * To change this template, choose Tools | Templates
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

import javax.swing.text.*;

public class FixedMoney extends PlainDocument {

    public static final int NUMERO_DIGITOS_MAXIMO = 12;

    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

    String texto = getText(0, getLength());
    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        
        if (!Character.isDigit(c)) {
            if (!(String.valueOf(c).equals("."))){
                return;
            } else {
                c = (char) Integer.parseInt("");
            }
        }
        
    }

    if(texto.length() < this.NUMERO_DIGITOS_MAXIMO){

        super.remove(0, getLength());
        texto = texto.replace(".", "").replace(",", "");
        StringBuffer s = new StringBuffer(texto + str);

        if (s.length() > 0 && s.charAt(0) == '0') {
            s.deleteCharAt(0);
        }

        if(s.length() < 3) {
            if (s.length() < 1) {
                s.insert(0,"000");
            }else if (s.length() < 2) {
                s.insert(0,"00");
            }else{
                s.insert(0,"0");
            }
        }

        //s.insert(s.length()-2, ","); //linha original
        s.insert(s.length()-2, "."); // linha criada por mim, para que fique ponto após a virgula

        //os dois próximos if foram comentados para que não formem divisão em unidade de centenas
        /*
        if(s.length() > 6) {
            s.insert(s.length()-6, ".");
        }

        if(s.length() > 10) {
            s.insert(s.length()-10, ".");
        }
        */
        
        super.insertString(0, s.toString(), a);

    }

    }

    public void remove(int offset, int length) throws BadLocationException {

        super.remove(offset, length);

        String texto = getText(0, getLength());
        //texto = texto.replace(",", ""); //linha original comentada, a linha abaixo é originalmente do código também
        texto = texto.replace(".", "");
        
        super.remove(0, getLength());
        insertString(0, texto, null);

    }

}