/*
 * This file is part of antlr-java-parser.
 *
 *     antlr-java-parser is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     antlr-java-parser is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with antlr-java-parser.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.antlrjavaparser.adapter;

import com.github.antlrjavaparser.Java7Parser;
import com.github.antlrjavaparser.api.body.BodyDeclaration;

public class MemberDeclContextAdapter implements Adapter<BodyDeclaration, Java7Parser.MemberDeclContext> {
    public BodyDeclaration adapt(Java7Parser.MemberDeclContext context, AdapterParameters adapterParameters) {

        if (context.methodDeclaration() != null) {
            return Adapters.getMethodDeclarationContextAdapter().adapt(context.methodDeclaration(), adapterParameters);
        } else if (context.fieldDeclaration() != null) {
            return Adapters.getFieldDeclarationContextAdapter().adapt(context.fieldDeclaration(), adapterParameters);
        } else if (context.classDeclaration() != null) {
            return Adapters.getClassDeclarationContextAdapter().adapt(context.classDeclaration(), adapterParameters);
        } else if (context.interfaceDeclaration() != null) {
            return Adapters.getInterfaceDeclarationContextAdapter().adapt(context.interfaceDeclaration(), adapterParameters);
        } else if (context.constructorDeclaration() != null) {
            return Adapters.getConstructorDeclarationContextAdapter().adapt(context.constructorDeclaration(), adapterParameters);
        }

        return null;
    }
}
