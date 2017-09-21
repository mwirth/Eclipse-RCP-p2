
package org.wimi.rcp.extra.one;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

public class OpenPartCommand
{
	@Inject
	EPartService partService;
	MApplication application;
	EModelService modelService;

	@Execute
	public void execute()
	{
		System.out.println("OpenPartCommand");
		MPart showPart = partService.showPart("org.wimi.rcp.part.extraone", PartState.ACTIVATE);
		System.out.println(showPart);
	}
}
