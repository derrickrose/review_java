package org.review.amz.design_pattern.creational.abstract_factory;
/*
 * This is used to create DBConnectionObject according to existing infrastructure.
 *
 * @author frils
 * @version 1.0
 * @since 1.0 on 2020/07/21
 * @reference GeeksForGeeks
 */
abstract class InfrastructureFactory {

  abstract IRelationalDB getRelationalDB();

  abstract INonRelationalDB getNonRelationalDB();
}
