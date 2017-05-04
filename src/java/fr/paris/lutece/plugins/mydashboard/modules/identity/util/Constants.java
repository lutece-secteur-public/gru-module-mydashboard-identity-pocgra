/*
 * Copyright (c) 2002-2016, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.mydashboard.modules.identity.util;

import fr.paris.lutece.portal.service.util.AppPropertiesService;


/**
 * This class provides constants for identity services
 *
 */
public final class Constants
{
    
    public static final String TRUE = "1";
    public static final String FALSE = "0";

    // properties
 
    
    public static final String PROPERTY_APPLICATION_CODE = "mydashboard.identity.application.code";
    public static final String PROPERTY_APPLICATION_NAME = "mydashboard.identity.application.name";
    public static final String PROPERTY_KEY_LOGIN = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.login" );
    public static final String PROPERTY_KEY_GENDER = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.gender" );
    public static final String PROPERTY_KEY_BIRTHDATE = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.bdate" );
    public static final String PROPERTY_KEY_BIRTHPLACE = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.bplace" );
    public static final String PROPERTY_KEY_NAME = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.name.family" );
    public static final String PROPERTY_KEY_PREFERREDUSERNAME = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.name.preferred-username" );
    public static final String PROPERTY_KEY_FIRSTNAME = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.name.given" );
    public static final String PROPERTY_KEY_BIRTHCOUNTRY = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.bcountry" );
    public static final String PROPERTY_KEY_ADDRESS = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.home-info.postal.address" );
    public static final String PROPERTY_KEY_ADDRESSDETAIL = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.home-info.postal.addressdetail" );
    public static final String PROPERTY_KEY_ADDRESS_POSTAL_CODE = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.home-info.postal.postalcode" );
    public static final String PROPERTY_KEY_ADDRESS_CITY = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.home-info.postal.city" );
    public static final String PROPERTY_KEY_BILLING_ADDRESS = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.billing-info.postal.address" );
    public static final String PROPERTY_KEY_BILLING_ADDRESSDETAIL = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.billing-info.postal.addressdetail" );
    public static final String PROPERTY_KEY_BILLING_ADDRESS_POSTAL_CODE = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.billing-info.postal.postalcode" );
    public static final String PROPERTY_KEY_BILLING_ADDRESS_CITY = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.billing-info.postal.city" );
    public static final String PROPERTY_KEY_EMAIL = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.home-info.online.email" );
    public static final String PROPERTY_KEY_MOBILE_PHONE = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.home-info.telecom.mobile.number" );
    public static final String PROPERTY_KEY_PHONE = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.home-info.telecom.telephone.number" );
    public static final String PROPERTY_KEY_PREFERRED_CONTACT = AppPropertiesService.getProperty( 
            "mydashboard.identity.attribute.user.home-info.preferred-contact-mode" );
    public static final String PROPERTY_KEY_GENDER_LIST = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.listref.gender" );
    public static final String PROPERTY_KEY_CONTACT_MODE_LIST = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.listref.contact-mode" );
    public static final String PROPERTY_KEY_ACCEPT_NEWS = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.acceptnews" );
    public static final String PROPERTY_KEY_ACCEPT_SURVEY = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.acceptsurvey" );
    public static final String PROPERTY_KEY_DIRECTION = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.direction" );
    public static final String PROPERTY_KEY_SOI= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.soi" );
    
    public static final String PROPERTY_KEY_NUM_BUREAU= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.numBureau" );
    
    
    public static final String PROPERTY_KEY_TEL_PRO= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.telPro" );
    
    
    public static final String PROPERTY_KEY_CATEGORIE= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.categorie" );
    public static final String PROPERTY_KEY_CORPS= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.corps" );
    public static final String PROPERTY_KEY_GRADE= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.grade" );
    public static final String PROPERTY_KEY_POSITION_ADMINISTRATIVE= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.positionAdministrative" );
    public static final String PROPERTY_KEY_AFFECTECTATION_DATE= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.affectationDate" );
    public static final String PROPERTY_KEY_ENTITE_JURIDIQUE= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.entiteJuridique" );
    public static final String PROPERTY_KEY_SERVICE_CENTRAUX= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.serviceCentraux" );
    public static final String PROPERTY_KEY_NIVEAU= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.niveau" );
    public static final String PROPERTY_KEY_ENCADRANT= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.encadrant" );
    public static final String PROPERTY_KEY_IS_ENCADRANT= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.isEncadrant" );
    public static final String PROPERTY_KEY_RH_NOM_USAGE= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.rhNomUsage" );
    public static final String PROPERTY_KEY_RH_PRENOM= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.rhPrenom" );
    public static final String PROPERTY_KEY_RH_TEL= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.rhTel" );
    public static final String PROPERTY_KEY_UGD_SOI= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.ugdSoi" );
    public static final String PROPERTY_KEY_UGD_UNITE =AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.ugdUnite" );
    public static final String PROPERTY_KEY_UGD_UNITE_SOI= AppPropertiesService.getProperty( 
            "mydashboard.identity.application.user.ugdUniteSoi" );
 
    

    //Fields validation messages
    public static final String MESSAGE_ERROR_UPDATE_IDENTITY = "module.mydashboard.identity.message.error.identity.update";
    public static final String MESSAGE_INFO_IDENTITY_UPDATED = "module.mydashboard.identity.message.info.identity.updated";
    public static final String MESSAGE_ERROR_VALIDATION_LASTNAME = "module.mydashboard.identity.message.error.identity.check.format.lastname";
    public static final String MESSAGE_ERROR_VALIDATION_PREFFEREDUSERNAME = "module.mydashboard.identity.message.error.identity.check.format.preferredusername";
    public static final String MESSAGE_ERROR_VALIDATION_FIRSTNAME = "module.mydashboard.identity.message.error.identity.check.format.firstname";
    public static final String MESSAGE_ERROR_VALIDATION_BIRTHDATE = "module.mydashboard.identity.message.error.identity.check.format.birthdate";
    public static final String MESSAGE_ERROR_VALIDATION_BIRTHPLACE = "module.mydashboard.identity.message.error.identity.check.format.birthplace";
    public static final String MESSAGE_ERROR_VALIDATION_BIRTHCOUNTRY = "module.mydashboard.identity.message.error.identity.check.format.birthcountry";
    public static final String MESSAGE_ERROR_VALIDATION_BIRTHCITY = "module.mydashboard.identity.message.error.identity.check.format.birthcity";
    public static final String MESSAGE_ERROR_VALIDATION_ADDRESS = "module.mydashboard.identity.message.error.identity.check.format.address";
    public static final String MESSAGE_ERROR_VALIDATION_ADDRESS_DETAIL = "module.mydashboard.identity.message.error.identity.check.format.address-detail";
    public static final String MESSAGE_ERROR_VALIDATION_ADDRESS_POSTALCODE = "module.mydashboard.identity.message.error.identity.check.format.address-postalcode";
    public static final String MESSAGE_ERROR_VALIDATION_ADDRESS_CITY = "module.mydashboard.identity.message.error.identity.check.format.address-city";
    public static final String MESSAGE_ERROR_VALIDATION_PHONE = "module.mydashboard.identity.message.error.identity.check.format.phone";
    public static final String MESSAGE_ERROR_VALIDATION_MOBILEPHONE = "module.mydashboard.identity.message.error.identity.check.format.mobilephone";
    public static final String MESSAGE_ERROR_VALIDATION_EMAIL = "module.mydashboard.identity.message.error.identity.check.format.email";
    public static final String MESSAGE_ERROR_EMAIL_EMPTY = "module.mydashboard.identity.message.error.identity.check.empty.email";
    public static final String MESSAGE_ERROR_TELEPHONE_EMPTY = "module.mydashboard.identity.message.error.identity.check.empty.phone";

    // FIELDS VALIDATION REGEXP
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_LAST_NAME = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.lastname" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_PREFERREDUSERNAME = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.preferredusername" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_FIRSTNAME = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.firstname" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_BIRTHPLACE = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.birthplace" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_BIRTHCOUNTRY = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.birthcountry" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_BIRTHDATE = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.birthdate" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_PHONE = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.phone" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_MOBILEPHONE = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.mobilephone" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_ADDRESS = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.address" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_ADDRESS_DETAIL = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.address-detail" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_ADDRESS_POSTALCODE = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.address-postalcode" );
    public static final String PROPERTY_KEY_VALIDATION_REGEXP_ADDRESS_CITY = AppPropertiesService.getProperty( 
            "mydashboard.identity.application.validation.regex.address-city" );
    
    //Fields for dashboard Identity
    public static final String ATTRIBUTE_DB_IDENTITY_CONNECTION_ID = "connectionId";
    public static final String ATTRIBUTE_DB_IDENTITY_CUSTOMER_ID = "customerId";
    public static final String ATTRIBUTE_DB_IDENTITY_LAST_NAME = "lastName";
    public static final String ATTRIBUTE_DB_IDENTITY_PREFERRED_USER_NAME = "preferredUsername";
    public static final String ATTRIBUTE_DB_IDENTITY_FIRSTNAME = "firstname";
    public static final String ATTRIBUTE_DB_IDENTITY_GENDER = "gender";
    public static final String ATTRIBUTE_DB_IDENTITY_BIRTHDATE = "birthdate";
    public static final String ATTRIBUTE_DB_IDENTITY_BIRTHPLACE = "birthplace";
    public static final String ATTRIBUTE_DB_IDENTITY_BIRTHCOUNTRY = "birthcountry";
    public static final String ATTRIBUTE_DB_IDENTITY_ADDRESS = "address";
    public static final String ATTRIBUTE_DB_IDENTITY_ADDRESS_DETAIL = "address_detail";
    public static final String ATTRIBUTE_DB_IDENTITY_ADDRESS_POSTAL_CODE = "address_postalcode";
    public static final String ATTRIBUTE_DB_IDENTITY_ADDRESS_CITY = "address_city";
    public static final String ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS = "billing_address";
    public static final String ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_DETAIL = "billing_address_detail";
    public static final String ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_POSTAL_CODE = "billing_address_postalcode";
    public static final String ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_CITY = "billing_address_city";
    public static final String ATTRIBUTE_DB_IDENTITY_EMAIL = "email";
    public static final String ATTRIBUTE_DB_IDENTITY_PHONE = "phone";
    public static final String ATTRIBUTE_DB_IDENTITY_PREFERRED_CONTACT_MODE = "preferred_contact_mode";
    public static final String ATTRIBUTE_DB_IDENTITY_LOGIN = "login";
    public static final String ATTRIBUTE_DB_IDENTITY_MOBILE_PHONE = "mobile_phone";
    public static final String ATTRIBUTE_DB_IDENTITY_ACCEPT_NEWS = "accept_news";
    public static final String ATTRIBUTE_DB_IDENTITY_ACCEPT_SURVEY = "accept_survey";
    public static final String ATTRIBUTE_DB_IDENTITY_FRANCE_CONNECT_CERTIFIED = "franceconnect_certified";
    public static final String ATTRIBUTE_DB_IDENTITY_DIRECTION = "direction";
    public static final String ATTRIBUTE_DB_IDENTITY_SOI = "soi";
    public static final String ATTRIBUTE_DB_IDENTITY_NUM_BUREAU= "num_bureau";
    public static final String ATTRIBUTE_DB_IDENTITY_TEL_PRO= "tel_pro";
    public static final String ATTRIBUTE_DB_IDENTITY_CATEGORIE= "categorie";
    public static final String ATTRIBUTE_DB_IDENTITY_CORPS= "corps";
    public static final String ATTRIBUTE_DB_IDENTITY_GRADE= "grade";
    public static final String ATTRIBUTE_DB_IDENTITY_POSITION_ADMINISTRATIVE= "position_administrative";
    public static final String ATTRIBUTE_DB_IDENTITY_AFFECTION_DATE= "affection_date";
    public static final String ATTRIBUTE_DB_IDENTITY_ENTITE_JURIDIQUE= "entite_juridique";
    public static final String ATTRIBUTE_DB_IDENTITY_SERVICE_CENTRAUX= "service_centraux";
    public static final String ATTRIBUTE_DB_IDENTITY_NIVEAU= "niveau";
    public static final String ATTRIBUTE_DB_IDENTITY_ENCADRANT= "encadrant";
    public static final String ATTRIBUTE_DB_IDENTITY_IS_ENCADRANT= "is_encadrant";
    public static final String ATTRIBUTE_DB_IDENTITY_RH_NOM_USAGE= "rh_nom_usage";
    public static final String ATTRIBUTE_DB_IDENTITY_RH_PRENOM= "rh_prenom";
    public static final String ATTRIBUTE_DB_IDENTITY_RH_TEL= "rh_tel";
    public static final String ATTRIBUTE_DB_IDENTITY_UGD_SOI= "ugd_soi";
    public static final String ATTRIBUTE_DB_IDENTITY_UGD_UNITE= "ugd_unite";
    public static final String ATTRIBUTE_DB_IDENTITY_UGD_UNITE_SOI= "ugd_unite_soi";
    

    
    
    
    
    
    /**
     * Default constructor
     */
    private Constants(  )
    {
    }
}
