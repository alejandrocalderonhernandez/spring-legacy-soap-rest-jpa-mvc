
package xyz.oeste.integracion.endpoints;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegionEndPointService", targetNamespace = "http://endpoints.integracion.oeste.xyz/", wsdlLocation = "http://localhost:8080/integracion-ws-soap/wsRegion?wsdl")
public class RegionEndPointService
    extends Service
{

    private final static URL REGIONENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGIONENDPOINTSERVICE_EXCEPTION;
    private final static QName REGIONENDPOINTSERVICE_QNAME = new QName("http://endpoints.integracion.oeste.xyz/", "RegionEndPointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/integracion-ws-soap/wsRegion?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGIONENDPOINTSERVICE_WSDL_LOCATION = url;
        REGIONENDPOINTSERVICE_EXCEPTION = e;
    }

    public RegionEndPointService() {
        super(__getWsdlLocation(), REGIONENDPOINTSERVICE_QNAME);
    }

    public RegionEndPointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGIONENDPOINTSERVICE_QNAME, features);
    }

    public RegionEndPointService(URL wsdlLocation) {
        super(wsdlLocation, REGIONENDPOINTSERVICE_QNAME);
    }

    public RegionEndPointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGIONENDPOINTSERVICE_QNAME, features);
    }

    public RegionEndPointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegionEndPointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegionEndPoint
     */
    @WebEndpoint(name = "RegionEndPointPort")
    public RegionEndPoint getRegionEndPointPort() {
        return super.getPort(new QName("http://endpoints.integracion.oeste.xyz/", "RegionEndPointPort"), RegionEndPoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegionEndPoint
     */
    @WebEndpoint(name = "RegionEndPointPort")
    public RegionEndPoint getRegionEndPointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoints.integracion.oeste.xyz/", "RegionEndPointPort"), RegionEndPoint.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGIONENDPOINTSERVICE_EXCEPTION!= null) {
            throw REGIONENDPOINTSERVICE_EXCEPTION;
        }
        return REGIONENDPOINTSERVICE_WSDL_LOCATION;
    }

}
