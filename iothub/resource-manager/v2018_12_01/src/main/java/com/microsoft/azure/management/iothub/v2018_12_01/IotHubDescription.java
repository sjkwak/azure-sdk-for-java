/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2018_12_01.implementation.DevicesManager;
import com.microsoft.azure.management.iothub.v2018_12_01.implementation.IotHubDescriptionInner;

/**
 * Type representing IotHubDescription.
 */
public interface IotHubDescription extends HasInner<IotHubDescriptionInner>, Resource, GroupableResourceCore<DevicesManager, IotHubDescriptionInner>, HasResourceGroup, Refreshable<IotHubDescription>, Updatable<IotHubDescription.Update>, HasManager<DevicesManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the properties value.
     */
    IotHubProperties properties();

    /**
     * @return the sku value.
     */
    IotHubSkuInfo sku();

    /**
     * The entirety of the IotHubDescription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of IotHubDescription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a IotHubDescription definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the IotHubDescription definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the iothubdescription definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            */
            WithCreate withSku(IotHubSkuInfo sku);
        }

        /**
         * The stage of the iothubdescription update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the iothubdescription update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             */
            WithCreate withProperties(IotHubProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<IotHubDescription>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithEtag, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a IotHubDescription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<IotHubDescription>, Resource.UpdateWithTags<Update>, UpdateStages.WithEtag, UpdateStages.WithProperties {
    }

    /**
     * Grouping of IotHubDescription update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the iothubdescription {0} allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the iothubdescription {0} allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             */
            Update withProperties(IotHubProperties properties);
        }

    }
}
