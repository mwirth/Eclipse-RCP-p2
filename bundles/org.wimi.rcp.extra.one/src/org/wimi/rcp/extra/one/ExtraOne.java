
package org.wimi.rcp.extra.one;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ExtraOne
{

	@PostConstruct
	public void postConstruct(Composite parent)
	{
		new Label(parent, SWT.NONE).setText("Extra One in Version 1.0.0");
	}

}
