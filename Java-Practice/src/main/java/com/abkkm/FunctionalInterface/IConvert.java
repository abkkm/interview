package com.abkkm.FunctionalInterface;
@FunctionalInterface
public interface IConvert<F, T> {
    T convert(F form);
}