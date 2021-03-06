package io.qameta.allure.kotlin

import io.qameta.allure.kotlin.util.ResultsUtils
import java.lang.annotation.Inherited

/**
 * Used to link tests with test cases in external test management system.
 */
@MustBeDocumented
@Inherited
@Retention(AnnotationRetention.RUNTIME)
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER,
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.CLASS
)
@LinkAnnotation(type = ResultsUtils.TMS_LINK_TYPE)
/**
 * Due do compatibility with Java 1.6, Kotlin doesn't support repeatable annotations.
 * This annotation is still required in here, because of generic parsing of annotation containers
 * @see [AnnotationUtils.extractRepeatable]
 */
@Repeatable
annotation class TmsLink(val value: String)