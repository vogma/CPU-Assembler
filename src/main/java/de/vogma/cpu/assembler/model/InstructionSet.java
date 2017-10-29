/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.vogma.cpu.assembler.model;

/**
 *
 * @author root
 */
public enum InstructionSet {
    NOP("00"), MOV("01"), IN("02"), STO("03"), LOD("04"), PUSH("05"), POP("06"), PRN("07"), CALL("08"), RTS("09"), ADD("0A"), SUB("0B"), INC(""), DEC(""), COMP(""), SHIFTL(""), SHIFTR(""), ROTL(""), ROTR(""), AND(""), OR(""), NOR(""), NAND(""), XOR(""), XNOR("");

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
