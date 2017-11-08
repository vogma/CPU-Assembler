/*
 * The MIT License
 *
 * Copyright 2017 Your Organisation.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package de.vogma.cpu.assembler;

import de.vogma.cpu.assembler.model.InstructionSet;

/**
 *
 * @author root
 */
class Parser {

    private String code;

    public Parser(String code) {
        this.code = code;
    }

    
    /**
     * Initilisiert die Herstellung von HEX-Code für Logisim
     * @return String: Formatierter HEX-Code. Kann so in Speicher geladen werden.
     */
    public String parse() {
//        return "v2.0 raw\n02000303 \n"
//                + "05000000 \n"
//                + "01000001   \n"
//                + "02000100  \n"
//                + "05000000\n"
//                + "0A000000";
        String[] lines = code.split(";");
        parseCommands(lines);
        String output = "v2.0 raw\n";
        for (String a : lines) {
            output = output.concat(a);
        }
        return output;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Durchläuft jede Codezeile und ruft Methode createInstructions auf
     * @param lines Alle Zeilen die zu parsen sind. 
     */
    private void parseCommands(String[] lines) {
        for (String line : lines) {
            createInstruction(line);
        }
    }

    /**
     * Erzeugt HEX Instruktion für Logisim 
     * @param line 
     */
    private void createInstruction(String line) {
        Instruction instruction = new Instruction();
        String opCode = line.split(" ")[0];
        switch(opCode){
           // case InstructionSet.ADD.toString(): opCode = "0B";break;
        }
    }
}
