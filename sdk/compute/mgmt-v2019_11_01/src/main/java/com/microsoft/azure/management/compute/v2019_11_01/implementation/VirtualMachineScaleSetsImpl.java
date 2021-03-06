/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSets;
import com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSet;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetInstanceView;
import com.microsoft.azure.management.compute.v2019_11_01.UpgradeOperationHistoricalStatusInfo;
import com.microsoft.azure.management.compute.v2019_11_01.RecoveryWalkResponse;
import java.util.List;
import com.microsoft.azure.management.compute.v2019_11_01.VirtualMachineScaleSetSku;

class VirtualMachineScaleSetsImpl extends GroupableResourcesCoreImpl<VirtualMachineScaleSet, VirtualMachineScaleSetImpl, VirtualMachineScaleSetInner, VirtualMachineScaleSetsInner, ComputeManager>  implements VirtualMachineScaleSets {
    protected VirtualMachineScaleSetsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSets(), manager);
    }

    @Override
    protected Observable<VirtualMachineScaleSetInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<VirtualMachineScaleSet> listByResourceGroup(String resourceGroupName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualMachineScaleSet> listByResourceGroupAsync(String resourceGroupName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetInner>, Iterable<VirtualMachineScaleSetInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetInner> call(Page<VirtualMachineScaleSetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineScaleSetInner, VirtualMachineScaleSet>() {
            @Override
            public VirtualMachineScaleSet call(VirtualMachineScaleSetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VirtualMachineScaleSet> list() {
        VirtualMachineScaleSetsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<VirtualMachineScaleSet> listAsync() {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetInner>, Iterable<VirtualMachineScaleSetInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetInner> call(Page<VirtualMachineScaleSetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineScaleSetInner, VirtualMachineScaleSet>() {
            @Override
            public VirtualMachineScaleSet call(VirtualMachineScaleSetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualMachineScaleSetImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable deallocateAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.deallocateAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable deleteInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.deleteInstancesAsync(resourceGroupName, vmScaleSetName, instanceIds).toCompletable();
    }

    @Override
    public Observable<VirtualMachineScaleSetInstanceView> getInstanceViewAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getInstanceViewAsync(resourceGroupName, vmScaleSetName)
        .map(new Func1<VirtualMachineScaleSetInstanceViewInner, VirtualMachineScaleSetInstanceView>() {
            @Override
            public VirtualMachineScaleSetInstanceView call(VirtualMachineScaleSetInstanceViewInner inner) {
                return new VirtualMachineScaleSetInstanceViewImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<UpgradeOperationHistoricalStatusInfo> getOSUpgradeHistoryAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.getOSUpgradeHistoryAsync(resourceGroupName, vmScaleSetName)
        .flatMapIterable(new Func1<Page<UpgradeOperationHistoricalStatusInfoInner>, Iterable<UpgradeOperationHistoricalStatusInfoInner>>() {
            @Override
            public Iterable<UpgradeOperationHistoricalStatusInfoInner> call(Page<UpgradeOperationHistoricalStatusInfoInner> page) {
                return page.items();
            }
        })
        .map(new Func1<UpgradeOperationHistoricalStatusInfoInner, UpgradeOperationHistoricalStatusInfo>() {
            @Override
            public UpgradeOperationHistoricalStatusInfo call(UpgradeOperationHistoricalStatusInfoInner inner) {
                return new UpgradeOperationHistoricalStatusInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable powerOffAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.powerOffAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable restartAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.restartAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable startAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.startAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable redeployAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.redeployAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable performMaintenanceAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.performMaintenanceAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable updateInstancesAsync(String resourceGroupName, String vmScaleSetName, List<String> instanceIds) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.updateInstancesAsync(resourceGroupName, vmScaleSetName, instanceIds).toCompletable();
    }

    @Override
    public Completable reimageAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.reimageAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Completable reimageAllAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.reimageAllAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    public Observable<RecoveryWalkResponse> forceRecoveryServiceFabricPlatformUpdateDomainWalkAsync(String resourceGroupName, String vmScaleSetName, int platformUpdateDomain) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.forceRecoveryServiceFabricPlatformUpdateDomainWalkAsync(resourceGroupName, vmScaleSetName, platformUpdateDomain)
        .map(new Func1<RecoveryWalkResponseInner, RecoveryWalkResponse>() {
            @Override
            public RecoveryWalkResponse call(RecoveryWalkResponseInner inner) {
                return new RecoveryWalkResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable convertToSinglePlacementGroupAsync(String resourceGroupName, String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.convertToSinglePlacementGroupAsync(resourceGroupName, vmScaleSetName).toCompletable();
    }

    @Override
    protected VirtualMachineScaleSetImpl wrapModel(VirtualMachineScaleSetInner inner) {
        return  new VirtualMachineScaleSetImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualMachineScaleSetImpl wrapModel(String name) {
        return new VirtualMachineScaleSetImpl(name, new VirtualMachineScaleSetInner(), this.manager());
    }

    private VirtualMachineScaleSetSkuImpl wrapVirtualMachineScaleSetSkuModel(VirtualMachineScaleSetSkuInner inner) {
        return  new VirtualMachineScaleSetSkuImpl(inner, manager());
    }

    @Override
    public Observable<VirtualMachineScaleSetSku> listSkusAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listSkusAsync(resourceGroupName, vmScaleSetName)
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetSkuInner>, Iterable<VirtualMachineScaleSetSkuInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetSkuInner> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineScaleSetSkuInner, VirtualMachineScaleSetSku>() {
            @Override
            public VirtualMachineScaleSetSku call(VirtualMachineScaleSetSkuInner inner) {
                return wrapVirtualMachineScaleSetSkuModel(inner);
            }
        });
    }

}
