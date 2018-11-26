package ru.itx.ss7app;

import org.mobicents.protocols.api.Management;
import org.mobicents.protocols.sctp.ManagementImpl;

public class SS7App {

	public static void main(final String[] args) throws Exception {
		
		Management sctpManagement = new ManagementImpl("ss7app");
		sctpManagement.setSingleThread(true);
		sctpManagement.start();
	}

}
