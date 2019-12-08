/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

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

public class TextDocument extends PlainDocument {

    private int tamanhoMax = 4000;


    public TextDocument() {
        super();
    }

    public TextDocument(int tamanho) {
        super();
        tamanhoMax = tamanho;
    }

    /**
    * A cada tecla pressionada valida a tecla verifica se não está no máximo que o campo pode aguentar.
    *
    * @see javax.swing.text.Document#insertString(int, java.lang.String, javax.swing.text.AttributeSet)
    */
    
    public void insertString(int offs, String str, AttributeSet a)
    throws BadLocationException {

        if (str == null) return;

            String oldString = getText (0, getLength() );
            String newString = oldString.substring(0, offs) + str + oldString.substring(offs);

        if (newString.length() > tamanhoMax) {
            super.insertString(offs, "", a);
        } else {
            // Repassa para o pai.
            super.insertString(offs, str, a);
    }

    }

}