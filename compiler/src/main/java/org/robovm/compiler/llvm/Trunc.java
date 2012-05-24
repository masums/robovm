/*
 * Copyright (C) 2012 RoboVM
 *
 * TODO: Insert proper license header.
 */
package org.robovm.compiler.llvm;

/**
 *
 * @version $Id$
 */
public class Trunc extends ConversionInstruction {
    public Trunc(Variable result, Value op, Type type) {
        super("trunc", result, op, type);
    }
}