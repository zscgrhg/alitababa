package com.example.alitababa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.alitababa.entity.User;
import net.jodah.typetools.TypeResolver;
import sun.reflect.generics.reflectiveObjects.TypeVariableImpl;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public interface UserMapper extends BaseMapper<User> {
    User hello();
    <S> S ss();

    @Override
    int deleteById(Serializable id);

    public static void main(String[] args) throws Exception{
        /*Method[] methods = UserMapper.class.getMethods();
        Method selectBatchIds = UserMapper.class.getMethod("selectBatchIds", Collection.class);
        Class<?> aClass = GenericTypeResolver.resolveReturnType(selectBatchIds, UserMapper.class);
        TypeVariable<Method>[] typeParameters1 = selectBatchIds.getTypeParameters();

        Method ss = UserMapper.class.getMethod("ss");
        TypeVariable<Method>[] typeParameters = ss.getTypeParameters();
        System.out.println(typeParameters);*/

     /*   Type typeArgs = TypeResolver.reify(BaseMapper.class, UserMapper.class);
        ParameterizedType paramType = (ParameterizedType) typeArgs;

        Type[] actualTypeArgs = paramType.getActualTypeArguments();
        for (Type actualTypeArg : actualTypeArgs) {

        }*/
        Method ss = UserMapper.class.getMethod("deleteById", Serializable.class);
        //Method ss = UserMapper.class.getMethod("hello");
        System.out.println(ss.toGenericString());
        System.out.println(ss.getDeclaringClass());
        Type returnType = ss.getGenericReturnType();
        System.out.println(returnType);
        Type reify = TypeResolver.reify(returnType,UserMapper.class);
        System.out.println(reify);
        System.out.println(reify.getTypeName());
    }
}
