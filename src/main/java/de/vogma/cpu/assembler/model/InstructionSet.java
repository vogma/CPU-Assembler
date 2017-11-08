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
package de.vogma.cpu.assembler.model;

/**
 *
 * @author root
 */
public enum InstructionSet {
    NOP("00"), MOV("01"), IN("02"), STO("03"), LOD("04"), PUSH("05"), POP("06"), PRN("07"), CALL("08"), RTS("09"), ADD("0A"),
    SUB("0B"), INC(""), DEC(""), COMP(""), SHIFTL(""), SHIFTR(""), ROTL(""), ROTR(""), AND(""), OR(""), NOR(""), NAND(""), XOR(""),
    XNOR("");

    private String opcode;

    private InstructionSet(String opcode) {
        this.opcode = opcode;
    }

    public String hex() {
        return opcode;
    }
    
    public String binary(){
        return "00001";
    }
}
