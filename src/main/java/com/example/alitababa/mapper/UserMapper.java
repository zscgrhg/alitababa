package com.example.alitababa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.alitababa.entity.User;
import net.jodah.typetools.TypeResolver;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface UserMapper extends BaseMapper<User> {

    <S> S ss();
    public static void main(String[] args) throws Exception{
        /*Method[] methods = UserMapper.class.getMethods();
        Method selectBatchIds = UserMapper.class.getMethod("selectBatchIds", Collection.class);
        Class<?> aClass = GenericTypeResolver.resolveReturnType(selectBatchIds, UserMapper.class);
        TypeVariable<Method>[] typeParameters1 = selectBatchIds.getTypeParameters();

        Method ss = UserMapper.class.getMethod("ss");
        TypeVariable<Method>[] typeParameters = ss.getTypeParameters();
        System.out.println(typeParameters);*/

        Type typeArgs = TypeResolver.reify(BaseMapper.class, UserMapper.class);
        ParameterizedType paramType = (ParameterizedType) typeArgs;

        Type[] actualTypeArgs = paramType.getActualTypeArguments();
        for (Type actualTypeArg : actualTypeArgs) {

        }

    }
}
