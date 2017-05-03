/*
 * Copyright (c) 2002-2016, Mairie de Paris
 * All rights reserved.
 *
 * Rediibution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Rediibutions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Rediibutions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the diibution.
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
package fr.paris.lutece.plugins.mydashboard.modules.identity.business;

import fr.paris.lutece.plugins.mydashboard.modules.identity.util.Constants;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * DashboardIdentity
 *
 */
public class DashboardIdentity
{
    private Map<String, DashboardAttribute> _mapAttributes;
    
    public DashboardIdentity ()
    {
        _mapAttributes = new HashMap<String, DashboardAttribute>( );
    }
    
    /**
     * Set a value to a specific attribute of DashboardIdentityAttribute
     * @param key the name of the attribute
     * @param value the value of the attribute
     */
    public void setAttributeValue ( String key, String value )
    {
        DashboardAttribute attribute = _mapAttributes.get( key );
        if ( attribute != null )
        {
            attribute.setValue( value );
            _mapAttributes.put( key, attribute );
        }
    }
    
    /**
     * Get a DashboardAttribute for a key
     * @param key the key
     * @return the DashboardAttribute
     */
    public DashboardAttribute getAttribute ( String key )
    {
        return _mapAttributes.get( key );
    }
    
    /**
     * Set an attribute to DashboardIdentity attribute map
     * @param key the key of the attribute
     * @param attribute the DashboardAttribute to set
     */
    public void setAttribute ( String key, DashboardAttribute attribute )
    {
        if ( attribute != null )
        {
            _mapAttributes.put( key, attribute );
        }
    }

    /**
     * @return the _ConnectionId
     */
    public DashboardAttribute getConnectionId( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_CONNECTION_ID );
    }

    /**
     * @param connectionId
     *            the _ConnectionId to set
     */
    public void setConnectionId( DashboardAttribute connectionId )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_CONNECTION_ID, connectionId );
    }

    /**
     * @return the _CustomerId
     */
    public DashboardAttribute getCustomerId( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_CUSTOMER_ID );
    }

    /**
     * @param customerId
     *            the _customerId to set
     */
    public void setCustomerId( DashboardAttribute customerId )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_CUSTOMER_ID, customerId );
    }

    /**
     * @return the _LastName
     */
    public DashboardAttribute getLastName( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_LAST_NAME );
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName( DashboardAttribute lastName )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_LAST_NAME, lastName );
    }

    /**
     * @return the Preferred Username
     */
    public DashboardAttribute getPreferredUsername( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_PREFERRED_USER_NAME );
    }

    /**
     * @param preferredUsername
     *            the preferredUsername to set
     */
    public void setPreferredUsername( DashboardAttribute preferredUsername )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_PREFERRED_USER_NAME, preferredUsername );
    }

    /**
     * @return the _Firstname
     */
    public DashboardAttribute getFirstname( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_FIRSTNAME );
    }

    /**
     * @param firstname
     *            the firstname to set
     */
    public void setFirstname( DashboardAttribute firstname )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_FIRSTNAME, firstname );
    }

    /**
     * @return the _Gender
     */
    public DashboardAttribute getGender( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_GENDER );
    }

    /**
     * @param gender
     *            the gender to set
     */
    public void setGender( DashboardAttribute gender )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_GENDER, gender );
    }

    /**
     * @return the _Birthdate
     */
    public DashboardAttribute getBirthdate( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BIRTHDATE );
    }

    /**
     * @param birthdate
     *            the birthdate to set
     */
    public void setBirthdate( DashboardAttribute birthdate )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BIRTHDATE, birthdate );
    }

    /**
     * @return the _Birthplace
     */
    public DashboardAttribute getBirthplace( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BIRTHPLACE );
    }

    /**
     * @param birthplace
     *            the _birthplace to set
     */
    public void setBirthplace( DashboardAttribute birthplace )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BIRTHPLACE, birthplace );
    }

    /**
     * @return the Birthcountry
     */
    public DashboardAttribute getBirthcountry( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BIRTHCOUNTRY );
    }

    /**
     * @param birthcountry
     *            the birthcountry to set
     */
    public void setBirthcountry( DashboardAttribute birthcountry )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BIRTHCOUNTRY, birthcountry );
    }

    /**
     * @return the Address
     */
    public DashboardAttribute getAddress( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS );
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress( DashboardAttribute address )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS, address );
    }

    /**
     * @return the AddressDetail
     */
    public DashboardAttribute getAddressDetail( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS_DETAIL );
    }

    /**
     * @param addressDetail
     *            the addressDetail to set
     */
    public void setAddressDetail( DashboardAttribute addressDetail )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS_DETAIL, addressDetail );
    }

    /**
     * @return the _AddressPostalcode
     */
    public DashboardAttribute getAddressPostalcode( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS_POSTAL_CODE );
    }

    /**
     * @param addressPostalcode
     *            the addressPostalcode to set
     */
    public void setAddressPostalcode( DashboardAttribute addressPostalcode )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS_POSTAL_CODE, addressPostalcode );
    }

    /**
     * @return the AddressCity
     */
    public DashboardAttribute getAddressCity( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS_CITY );
    }

    /**
     * @param addressCity
     *            the addressCity to set
     */
    public void setAddressCity( DashboardAttribute addressCity )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ADDRESS_CITY, addressCity );
    }

    /**
     * @return the BillingAddress
     */
    public DashboardAttribute getBillingAddress( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS );
    }

    /**
     * @param billingAddress
     *            the billingAddress to set
     */
    public void setBillingAddress( DashboardAttribute billingAddress )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS, billingAddress );
    }

    /**
     * @return the BillingAddressDetail
     */
    public DashboardAttribute getBillingAddressDetail( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_DETAIL );
    }

    /**
     * @param billingAddressDetail
     *            the billingAddressDetail to set
     */
    public void setBillingAddressDetail( DashboardAttribute billingAddressDetail )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_DETAIL, billingAddressDetail );
    }

    /**
     * @return the BillingAddressPostalcode
     */
    public DashboardAttribute getBillingAddressPostalcode( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_POSTAL_CODE );
    }

    /**
     * @param billingAddressPostalcode
     *            the billingAddressPostalcode to set
     */
    public void setBillingAddressPostalcode( DashboardAttribute billingAddressPostalcode )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_POSTAL_CODE, billingAddressPostalcode );
    }

    /**
     * @return the BillingAddressCity
     */
    public DashboardAttribute getBillingAddressCity( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_CITY );
    }

    /**
     * @param billingAddressCity
     *            the billingAddressCity to set
     */
    public void setBillingAddressCity( DashboardAttribute billingAddressCity )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_BILLING_ADDRESS_CITY, billingAddressCity );
    }

    /**
     * @return the _Email
     */
    public DashboardAttribute getEmail( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_EMAIL );
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail( DashboardAttribute email )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_EMAIL, email );
    }

    /**
     * @return the _Phone
     */
    public DashboardAttribute getPhone( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_PHONE );
    }

    /**
     * @param phone
     *            the phone to set
     */
    public void setPhone( DashboardAttribute phone )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_PHONE, phone );
    }

    /**
     * @return the _MobilePhone
     */
    public DashboardAttribute getMobilePhone( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_MOBILE_PHONE );
    }

    /**
     * @param mobilePhone
     *            the mobilePhone to set
     */
    public void setMobilePhone( DashboardAttribute mobilePhone )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_MOBILE_PHONE, mobilePhone );
    }

    /**
     * @return the PreferredContactMode
     */
    public DashboardAttribute getPreferredContactMode( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_PREFERRED_CONTACT_MODE );
    }

    /**
     * @param preferredContactMode
     *            the Preferred Contact Mode to set
     */
    public void setPreferredContactMode( DashboardAttribute preferredContactMode )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_PREFERRED_CONTACT_MODE, preferredContactMode );
    }

    /**
     * @return the Login
     */
    public DashboardAttribute getLogin( )
    {
        //In this implementation of MyDashboardIdentity, login == email of user.
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_EMAIL );
    }

    /**
     * @param login
     *            the login to set
     */
    public void setLogin( DashboardAttribute login )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_LOGIN, login );
    }

    /**
     * @return the AcceptNews flag
     */
    public DashboardAttribute getAcceptNews( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ACCEPT_NEWS );
    }

    /**
     * @param bAcceptNews
     *            the AcceptNews flag to set
     */
    public void setAcceptNews( DashboardAttribute bAcceptNews )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ACCEPT_NEWS, bAcceptNews );
    }

    /**
     * @return the AcceptSurvey flag
     */
    public DashboardAttribute getAcceptSurvey( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ACCEPT_SURVEY );
    }

    /**
     * @param bAcceptSurvey
     *            the AcceptSurvey flag to set
     */
    public void setAcceptSurvey( DashboardAttribute bAcceptSurvey )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ACCEPT_SURVEY, bAcceptSurvey );
    }
    
    /**
     * @return the FranceConnectCertified flag
     */
    public DashboardAttribute getFranceConnectCertified( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_FRANCE_CONNECT_CERTIFIED );
    }
    
    /**
     * @return the Direction
     */
    public DashboardAttribute getDirection( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_DIRECTION );
    }

    /**
     * @param direction
     *            the direction to set
     */
    public void setDirection( DashboardAttribute direction )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_DIRECTION, direction );
    }
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getSoi( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_SOI );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setSoi( DashboardAttribute soi )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_SOI, soi );
    }
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getNumBureau( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_NUM_BUREAU );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setNumBureau( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_NUM_BUREAU, numBureau );
    }
    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getTelPro( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_TEL_PRO );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setTelPro( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_TEL_PRO, numBureau );
    } /**
     * @return the soi number
     */
    public DashboardAttribute getCategorie( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_CATEGORIE);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setCategorie( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_CATEGORIE, numBureau );
    } /**
     * @return the soi number
     */
    public DashboardAttribute getCorps( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_CORPS);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setCorps( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_CORPS, numBureau );
    } /**
     * @return the soi number
     */
    public DashboardAttribute getGrade( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_GRADE );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setGrade( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_GRADE, numBureau );
    } 
    
    
    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getPositionAdministrative( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_POSITION_ADMINISTRATIVE);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setPositionAdministrative( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_POSITION_ADMINISTRATIVE, numBureau );
    } 
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getAffectationDate()
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_AFFECTION_DATE );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setAffectationDate( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_AFFECTION_DATE, numBureau );
    }
    
    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getEntiteJuridique( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ENTITE_JURIDIQUE );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setEntiteJuridique( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ENTITE_JURIDIQUE, numBureau );
    } 

    
    /**
     * @return the soi number
     */
    public DashboardAttribute getServiceCentraux( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_SERVICE_CENTRAUX );
    }
    
    /**
     * @param soi
     *            the soi number
     */
    public void setServiceCentraux( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_SERVICE_CENTRAUX, numBureau );
    } 

    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getNiveau( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_NIVEAU);
    }
    /**
     * @param soi
     *            the soi number
     */
    public void setNiveau( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_NIVEAU, numBureau );
    } /**
     * @return the soi number
     */
    public DashboardAttribute getEncadrant( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_ENCADRANT);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setEncadrant( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_ENCADRANT, numBureau );
    } 
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getRhNomUsage( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_RH_NOM_USAGE );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setRhNomUsage( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_RH_NOM_USAGE, numBureau );
    }

    
    /**
     * @return the soi number
     */
    public DashboardAttribute getRhPrenom( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_RH_PRENOM );
    }
    /**
     * @param soi
     *            the soi number
     */
    public void setRhPrenom( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_RH_PRENOM, numBureau );
    } /**
     * @return the soi number
     */
    public DashboardAttribute getRhTel( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_RH_TEL );
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setRhTel( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_RH_TEL, numBureau );
    } 
    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getUgdSoi( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_UGD_SOI);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setUgdSoi( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_UGD_SOI, numBureau );
    } 
    
    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getUgdUnite( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_UGD_UNITE);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setUgdUnite( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_UGD_UNITE, numBureau );
    } 
    
    
    /**
     * @return the soi number
     */
    public DashboardAttribute getUgdUniteSoi( )
    {
        return _mapAttributes.get( Constants.ATTRIBUTE_DB_IDENTITY_UGD_UNITE_SOI);
    }

    /**
     * @param soi
     *            the soi number
     */
    public void setUgdUniteSoi( DashboardAttribute numBureau )
    {
        _mapAttributes.put( Constants.ATTRIBUTE_DB_IDENTITY_UGD_UNITE_SOI, numBureau );
    } 
    
    
    
    
}
